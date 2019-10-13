package fellowship;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
       int n=sc.nextInt();
	while(n%2==0)
	{
		System.out.print(2+" ");
		n=n/2;
	}
	for(int i=3;i<Math.sqrt(n);i++)
	{
		while(n%i==0)
		{
			System.out.print(3+" ");
			n=n/i;	
		}}
		if(n>2)
			System.out.print(n);	
	}
	

}
