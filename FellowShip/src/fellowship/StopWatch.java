package fellowship;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Starting time:");
		double start1=sc.nextDouble();
		
		 start1=System.currentTimeMillis();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the Stoping time:");
		double stop1=sc1.nextDouble();
		
		 stop1=System.currentTimeMillis();
		
		double output=stop1-start1;
		System.out.println("Answer:"+output);
	}

}
