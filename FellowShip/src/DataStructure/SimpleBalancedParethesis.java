package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class SimpleBalancedParethesis {
	  
		   static  Stack <Character>stack= new <Character> Stack();
			
			public static void main(String[] args) {
			
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("enter the symbols");
		   String str=scanner.next();
		   char ch[]=str.toCharArray();
		   boolean res=isParanthesis(ch);
		   if(res)
		   {
			   System.out.println("is balanced");
		   }
		   else
			   System.out.println("not balanced");
		   
		   
			}

			private static boolean isParanthesis(char[] ch) {
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]=='(')
					{
						stack.push('(');
						
					}
					if(ch[i]==')')
					{
						char c=stack.pop();	
					}
					
					if(ch[i]=='{'||ch[i]=='}'||ch[i]=='['||ch[i]==']')
					{
						return false;	
					}	
				}
				
				if(stack.isEmpty())
				{
					return true;
				}
				else
				return false;
			}
	}                                                                                                                                                                                                                                                                                                            

