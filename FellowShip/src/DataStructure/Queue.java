package DataStructure;

public class Queue {
 private int[] obj;
 private int rear;
 private int front;
 private int qs;
 
 Queue()
 {
	 qs=3;
	 rear=-1;
	 front=-1;
	 obj=new int[qs];
 }
 public void push(int data)
 {
	 if((front+1)>qs)
		 obj[++front]=data;
	 resize();
	 
	 }
 private void resize()
 {
	 int[] t=obj;
	qs= qs*2;
	 obj=new int[qs];
	 for(int i=0;i<=front;i++)
		 obj[i]=t[i];
	 
 }
 public Integer pop()
 {
	 if(front>rear)
		 return obj[++rear];
	 return null;
 }
 public boolean isempty()
 {
	 return front<=rear;
 }
 //public class Myqueue{
	 public static void main(String[] args) {
		Queue q=new Queue();
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		System.out.println(q.pop());
	}
 }

