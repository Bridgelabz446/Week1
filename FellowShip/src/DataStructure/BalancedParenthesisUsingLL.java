package DataStructure;

import java.util.Scanner;

public class BalancedParenthesisUsingLL {

	Node1 head;
	
	class Node1{
		Node1 next;
		char ch;
	}
	
	public void push(char ch) {
		Node1 newnode=new Node1();
		newnode.next=head;
		head=newnode;
		
	}
	public void deletelastt() {
		Node1 curr=null;
		for(curr=head;curr.next.next!=null;curr=curr.next) {}
		curr.next=null;
	}
	public void show()
	{
		Node1 t=head;
		while(t!=null) {
			System.out.println(t.ch+" ");
			t=t.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		char []ch=str.toCharArray();
//		boolean rs=isPren(ch);
//		if(rs) {
//			System.out.println("It is balanced");
//		}
//		else {
//			System.out.println("Not balanced");
//		}
	BalancedParenthesisUsingLL l=new BalancedParenthesisUsingLL();
	for(int i=0;i<ch.length;i++) {
	{if(ch[i]=='(')
		{l.push('(');}
	
	if(ch[i]==')')
	{
		l.deletelastt();
		System.out.println("balanced");
	}
	else
		System.out.println("Not balanced");}
	
	{if(ch[i]=='{')
	{l.push('{');}

if(ch[i]=='}')
{
	l.deletelastt();
	System.out.println("balanced");
}
else
	System.out.println("Not balanced");}
	
	
{if(ch[i]=='[')
{l.push('[');}

if(ch[i]==']')
{
l.deletelastt();
System.out.println("balanced");
}
else
System.out.println("Not balanced");}
	
//static boolean isPren(char []ch) {
//	
//		if(ch[i]=='(')
//		{
//		rs.push	('(');
//		}
//		
//
//	}
//	return false;

	
		
//		l.push('{');
//		l.push(')');
//		l.push('}');
	}

}
}
