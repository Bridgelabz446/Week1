package fellowship;

import java.util.Scanner;

public class DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the Row:");
int Row=sc.nextInt();

System.out.println("Enetr the Column:");
int Column=sc.nextInt();
System.out.println("Enetr the option: 1.Integer,2:Double,3:Boolean");
int ch=sc.nextInt();
int a[][]=new int[Row][Column];
boolean b[][]=new boolean[Row][Column];
double c[][]=new double[Row][Column];

switch(ch)
{
case 1:
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
		System.out.println(a[i][j]);
	    }
	    System.out.println(" ");
	}
	break;
case 2:
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
			b[i][j]=sc.nextBoolean();
		}
	}
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
		
		System.out.println(b[i][j]);
	}
	    System.out.println(" ");
	}
	break;
case 3:
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
			c[i][j]=sc.nextDouble();
		}
	}
	for(int i=0; i<=Row;i++)
	{
		for(int j=0;j<=Column;i++)
		{
		
		System.out.println(c[i][j]);
	}
	    System.out.println(" ");
	}
	break;

	default:
		System.out.println("Invalid ");	
}}}
