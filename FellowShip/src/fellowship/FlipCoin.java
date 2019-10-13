package fellowship;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int tail=0;
		int head=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the FlipCoin:");
       int FlipCoin=sc.nextInt();

while(count<=FlipCoin)
{
	if (Math.random()<0.5)
	{head++;
		}
	else
		tail++;
	
	count++;
	}
	System.out.print(" "+head);
	System.out.print(" "+tail);
	
	double h=(head/FlipCoin)*100;
	double t=(tail/FlipCoin)*100;
	
	System.out.println("Head"+" "+h);
	System.out.println("Tail"+" "+t);
	}
	}


