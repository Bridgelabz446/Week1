package DataStructure;
import java.util.Scanner;
public class Hashing {

		OrderedLIst list1[] = new OrderedLIst[11];
		private Object[] list;

		public Hashing() {
			for (int i = 0; i < list.length; i++) {
				list[i] = new OrderedLIst();
			}
		}

		void put(int n) {
			((OrderedLIst) list[n % 11]).add(n);
		}

		boolean search(int n) {
			return ((Hashing) list[n % 11]).search(n);
		}

		public static void main(String[] args) {
			Hashing hf = new Hashing();
			OrderedLIst ll = new OrderedLIst();
			Scanner s = new Scanner(System.in);
			System.out.println("sout no of elements to add");
			
			int n = s.nextInt();
			for (int i = 0; i < n; i++) {
				ll.add(s.nextInt());
			}

			
		}
	}
	

