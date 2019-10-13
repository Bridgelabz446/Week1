package Algorithm;

import java.util.ArrayList;

public class PrimePalindrome 
{
		public static void main(String[] args) 
		{
			ArrayList<Integer> alist = new ArrayList<Integer>();
			ArrayList<Integer> blist = new ArrayList<Integer>();
				for(int i=0;i<=1000;i++)
				{
				if(Utility.isPrime(i))
				{
					alist.add(i);
				}	
			}
		System.out.println(alist);
		 blist = Utility.isPrimePallindrom(alist);
		System.out.println(blist);
		
		}
}
		
		
