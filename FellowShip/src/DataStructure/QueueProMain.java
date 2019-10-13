package DataStructure;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueProMain extends Queue {
	
		public QueueProMain(String name, long amount) {
			super(name, amount);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("hiiiiiii");
			
			Queue record1=new  Queue("neelam",20000);
			Queue record2=new  Queue("suchi",50000);
			Queue record3=new  Queue("poonam",50000);
			Queue record4=new  Queue("neetu",50000);
			Queue record5=new  Queue("aavya",50000);
			Queue record6=new  Queue("saurabh",50000);
			
			
			PriorityQueue<Queue> queue=new PriorityQueue<Queue>(); 
			
			queue.add(record1);
			queue.add(record2);
			queue.add(record3);
			queue.add(record4);
			queue.add(record5);
			queue.add(record6);
			
			for(Queue p:queue)
			{
			System.out.println(p.name+" "+p.balance);
			}
			
			System.out.println("enter amount");
			Long amount=scanner.nextLong();
			
			
			System.out.println("enter choice withdraw for A and deposit for B");
			String choice=scanner.next();
			switch (choice)
			{
			     case "A":
			    	 Object n =queue.peek();
			    	 int k=(Integer)n;
			    	 System.out.println(k);
			    	 
			         break;
			         
			         
			     case "B":
			    	 Object obj1=queue.peek();
			    	 ((Queue) obj1).depositAmount(amount);
			         break;
			         
			     default: 
			            System.out.println("plz enter your  choice");
			            break; 
			}
			
			
			
			
			for(Queue p:queue)
			{
			System.out.println(p.name+" "+p.balance);
			}
			
		}
	}


