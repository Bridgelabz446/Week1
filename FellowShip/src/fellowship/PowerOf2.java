package fellowship;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
       int n=sc.nextInt();
       double power=0;
       if(n>0 && n<32)
       {
    	   for(int i=0;i<n;i++)
    	   {
    		   power=Math.pow(2,i);
    		   System.out.print(power);		   
    	   }   
       }
       else
    	   System.out.print("invalid Number:");
	}

}
