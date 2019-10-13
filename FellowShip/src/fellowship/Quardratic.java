package fellowship;

import java.util.Scanner;

public class Quardratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the value of a:");
				double a=sc.nextDouble();
				
				System.out.println("enter the value of b:");
				double b=sc.nextDouble();

				System.out.println("enter the value of c:");
				double c=sc.nextDouble();
				   double root1, root2;
				   double determinant = b * b - 4 * a * c;
				   System.out.println("determinant"+determinant); 
				   
				   root1=(-b+sqrt(determinant))/(2*a);
				   root2=(-b-sqrt(determinant))/(2*a);
				   System.out.println(root1);
				   System.out.println(root2);
				   
			}

			private static double sqrt(double determinant) {
				// TODO Auto-generated method stub
				return 0;
			}

	}
