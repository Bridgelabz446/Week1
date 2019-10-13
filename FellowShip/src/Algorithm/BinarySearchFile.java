package Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

	public class BinarySearchFile
	{
	 public static void main(String[] args)throws Exception
	 {
	 
	File file = new File("C:\\Users\\sict\\Desktop\\Java.txt");
	 BufferedReader br = new BufferedReader(new FileReader(file));
	 
	Scanner sc1=new Scanner(System.in);
	 
	 
	 String st;


	List<String>ls=new ArrayList<String>();

	 while ((st = br.readLine()) != null)
	 {

	 ls.add(st);
	 }
	 
	 Collections.sort(ls);
	 System.out.println(ls);
	 System.out.println("enter the string to be searched");
	 String x=sc1.nextLine();
	 //String arr[]=new String[collections(ls)];
	 String arr[]  = ls.toArray(new String[ls.size()]);
	 
	 
	 
	 int result= Utility.binarySearch(arr, x);
	 
	 if(result== -1)
	     {
	      System.out.println("Element dont Found");
	     }
	 else
	     {
	     System.out.println("Element-"+x+ "-found at index ==>> " +result);
	     }
	 
	 }
	 

	} 
	
