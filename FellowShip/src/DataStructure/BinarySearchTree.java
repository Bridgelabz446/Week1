package DataStructure;
import java.util.Scanner;
public class BinarySearchTree {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			BinarySearchTree bst=new BinarySearchTree();
			System.out.println("how many number wants to bst");
			int size=sc.nextInt();
			System.out.println("enter the elements");
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			for(int i=0;i<size;i++)
			{
				long res=bst.numberOfBinarySearchTree(arr[i]);
				System.out.println(res);
				
			}
			
			
			
		}

		private long numberOfBinarySearchTree(int key) {
			
			long bstNumber= factorial(2 * key)/(factorial(key + 1) * factorial(key));
			
			return bstNumber;
		}

		private long factorial(int i) {
			
			long fact=1;
			
			
			while(i>0)
			{
				fact=fact*i;
				i--;
			}
			
			
					return fact;
		}
}
