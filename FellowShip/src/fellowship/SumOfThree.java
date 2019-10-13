package fellowship;

import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[] = {1, 2, 4, -3, -1, 5, 6};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
		{
		for(int k=j+1;k<a.length;k++)
		{
			if(a[i]+a[j]+a[k]==0)
			{
				System.out.println("Numbers found : " + a[i] + "," + a[j] 
						+ " and " + a[k]);
			}
		}
		}
	}
		}

}
