package DataStructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class PrimeNoMatrix {
		boolean isPrime(int n) 
		{
			int c = 0;
			for(int i = 1; i<=1000; i++)
			{
				if(n%i == 0)
					c++;
			}
			if(c == 2)
				return true;
			else
				return false;
		}
    public static void main(String args[])throws IOException
    {
    	PrimeNoMatrix ob = new PrimeNoMatrix();
    		Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number of rows : ");
			int m=sc.nextInt();
			
			System.out.print("Enter the number of columns : ");
			int n=sc.nextInt();	
			
			int A[][]=new int[m][n];
			
			int B[] = new int [m*n];
			
			int i = 0, j;
			int k = 1; 
			
			while(i < m*n)
			{
				if(ob.isPrime(k)==true)
				{
					B[i] = k;
					i++;
				}
				k++;
			}
			int x = 0;
			
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					A[i][j] = B[x];
					x++;
				}
			}

			System.out.println("The Final Array is : ");
			for(i=0; i<m; i++)
			{
				for(j=0; j<n; j++)
				{
					System.out.print(A[i][j]+"\t");
				}
				System.out.println();
			}
    }}
	
	
