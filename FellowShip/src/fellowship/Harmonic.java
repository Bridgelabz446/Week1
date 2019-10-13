package fellowship;

import java.util.Scanner;

public class Harmonic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
       int n=sc.nextInt();
       float sum =1;
       for(int i=2;i<=n;i++)
       {
    	   
       	sum= sum+ (float)1/i;
    	       }System.out.println(sum);

        
	}

}
