package DataStructure;

public class BinaryTree {
	Binary root;
	private class Binary{
		private	Binary right;
		private	Binary left;
		private	int data;
	
	public Binary(int data){
		this.data=data;
	}
}
public void CreateTree() {
	Binary first=new Binary(9);
	Binary second=new Binary(8);
	Binary third=new Binary(7);
	Binary fourth=new Binary(6);
	Binary fifth=new Binary(3);
	
	root=first;
	
	first.left=second;
	first.right=third;
	
	second.left=fourth;
	second.right=fifth;
}
	public  void preorder(Binary root) {
		if(root==null) {
			return;
		}
	System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree bt=new BinaryTree();
bt.CreateTree();
System.out.println("Hii");
bt.preorder(bt.root);
	}

}
