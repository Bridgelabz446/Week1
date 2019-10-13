package fellowship;

import java.util.Scanner;

public class PrintName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.print("Enter the name:");
String st=sc.next();
if(st.length()>=3)
{
	System.out.println("Hello"+ " "+st+","+"How are you?");
	}
else
	System.out.println("Invalid String");
	}

}
