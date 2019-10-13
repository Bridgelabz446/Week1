package Algorithm;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter temp in c or f:");
			int temp = s.nextInt();
			char t = s.next().charAt(0);
			s.close();
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
				System.out.println("enter correct input");
				main(args);
				return;
			}
			temp = Utility.temperature(temp, t);
			System.out.println("coverted temp is :" + temp);
		} catch (Exception e) {
			System.out.println("temperature in format 4545 c");
		}

	}
}
