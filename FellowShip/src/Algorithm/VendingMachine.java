package Algorithm;

import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter amoumt:");
			int value = s.nextInt();
			notes(value);
			s.close();
		} catch (Exception e) {
			System.out.println("Enter value in integer");
		}
	}

		static int i, T;

		static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		static void notes(int value) {
			if (value / NOTES[i] != 0) {
				T += (value / NOTES[i]);
				System.out.println(NOTES[i] + "Rs notes :" + value / NOTES[i]);
				value = value % NOTES[i];
			}
			i++;
			if (value == 0) {
				System.out.println("total notes :" + T);
				return;
			}

			notes(value);

		}

		
	}

