package Algorithm;

import java.util.Scanner;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + Utility.sqrt(c));
			s.close();
		} catch (Exception e) {
			System.out.println("inter integer value "+e.getMessage());
		}

	}

}
