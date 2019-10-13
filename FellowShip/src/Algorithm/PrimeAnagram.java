package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PrimeAnagram {
  
	public static void main(String[] args) 
	{
		int start=1, end=100;
		for(int index=0;index<10;index++)
		{
			Stack a=new Stack();
			Stack b=new Stack();
			for(int n=start;n<end;n++)
			{
				if(Utility.isPrime(n))
				{
					a.add(n);
				}
			}
			System.out.println(a);
			start+=100;
			end+=100;
			////prime till here
			
			for(int j=1;j<a.size();j++)
			{
				for(int k=j+1;k<a.size();k++)
				{
					Object m=a.elementAt(j);
					Object n=a.elementAt(k);
					
					if(Utility.primeAnagram(m, n))
					{
						b.push(m);
						b.push(n);
					}
				}
			}
			System.out.println(b);	
		}	
	}
}