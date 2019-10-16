package DataStructure;

public class MiddleLL {
	 
		Node head;
	
	class Node1{
	int data;
	Node1 nxt;
	
	Node1(int d)
	{
		data=d;
		 nxt=null;
	}
}
void printmiddle()
{
	Node slow_ptr=head;
	Node fast_ptr=head;
	
	if(head!=null)
		{
		while(fast_ptr!=null && fast_ptr.ptr!=null)
		{
			fast_ptr=fast_ptr.ptr.ptr;
			slow_ptr=slow_ptr.ptr;
		}
		System.out.println("The middle element is"+slow_ptr.data);
		}
	}
void push(int new_data)
{
	Node new_node=new Node(new_data);
			new_node.ptr=head;
	head=new_node;
	}
void show()
{
	Node n=head;
	while(n!=null)
		{
		System.out.print(n.data+" ");
		n=n.ptr;
		
		}
	System.out.println("Null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MiddleLL mll=new MiddleLL();
for(int i=5;i>0;i--)
{
	mll.push(i);
	mll.show();
	mll.printmiddle();
}

	}

}
