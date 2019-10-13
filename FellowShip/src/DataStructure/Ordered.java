package DataStructure;

	import java.io.File;
	import java.io.IOException;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Scanner;

	public class Ordered {
		
		public static void main(String[] args) throws IOException {
		     System.out.println("hi");
			
			String path="C:\\Users\\sict\\Desktop\\BinarySearch.txt";
		    String string2;
			String string3="";
			
			File file=new File(path);
			
			
			Scanner s = new Scanner(file);
			LinkedList<Integer> ls=new LinkedList<Integer>();
			while (s.hasNextLine()) {
			    ls.add(s.nextInt());
			}
			
			System.out.println(ls);
			
			Collections.sort(ls);
			System.out.println(ls);
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter element whatever you want to search");
			int search=scanner.nextInt();
			
			if(ls.contains(search))
			{
				ls.remove((Integer)search);
				System.out.println(ls);
			}
			else
				{
				ls.add(search);
				System.out.println(ls);
				}
		
		}

	}
