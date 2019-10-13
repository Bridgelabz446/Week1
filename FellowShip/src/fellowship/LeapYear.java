package fellowship;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Year:");
		int y=sc.nextInt();
		if(y>=1999||y<10000)
		{
		if (((y%4==0)&&(y%100!=0))||(y%400==0))
			{System.out.println("Leap Year");}
		else
			{System.out.println("Not Leap Year");}
	}
		else {System.out.println("Invalid Year");}
}
	}
