package DataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class HassingSearchNumSlot {
	
		public static void main(String[] args) throws FileNotFoundException {
			System.out.println("hi");
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter number which  want to search: ");
			int search=scanner.nextInt();
			String path="C:\\Users\\nlm\\Desktop\\EclipseFile\\hasingFile.txt";
			File file=new File(path);
			Scanner scanner1=new Scanner(file);
			 Map< Integer,LinkedList> hashMap = new HashMap<Integer,LinkedList>();
			int j=0;
			 while(scanner1.hasNext())
			 {
				int num=scanner1.nextInt(); 
				int r=num%10;
				
				LinkedList <Integer>linkedList=new LinkedList <Integer>();
				linkedList.add(num);
				
				 boolean re=false;
				 for (int key : hashMap.keySet())
				 {  
					    
					    int lKey = key;
					  
					    if(lKey==r)
					    {    
					    	 LinkedList lk=hashMap.get(r);
					    	 linkedList.addAll(lk);
					    	 hashMap.remove(r);
					    	
					    	 hashMap.put(r, linkedList);
					    	 
					    	 re=true;
					    	 break;
					    }
					   
					   
					  				}
				 if(re==false)
				 {
					 hashMap.put(r,linkedList ); 
				 }
			 
			 }
		
			 System.out.println(Arrays.asList(hashMap));
	}

}
