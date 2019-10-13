package Algorithm;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = " ";
	       for (i = 1; i <= 1000; i++)         
	       { 		  	  
	          int c=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		c = c+ 1;
		     }
		  }
		  if (c ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);		   }}

