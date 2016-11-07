package bst;

public class Tree {
	private Node root;
	private Node current;
	
	public Tree(){
		root = null;
		current = root;
	}
	
	public void insert(int data){
		System.out.println("Inserting " + data);
		Node curNode = root;
		Node prevNode = curNode;
		boolean isLeft = false;
		
		if(root == null){
			root = new Node(data);
			return;
		}
		while(curNode != null){
			// go left
			prevNode = curNode;
			if(data < curNode.data ){
				curNode = curNode.left;
				isLeft = true;
			}
			// go right
			else if(data > curNode.data){
				curNode = curNode.right;
				isLeft = false;
			}
			
		}
		
		curNode = new Node(data);	
		
		if(isLeft)
			prevNode.left = curNode;
		else
			prevNode.right = curNode;
		
	}
	
	public void inOrder(){
		System.out.println("In Order");
		inOrder(root);
		System.out.println();
	}
	
	public void inOrder(Node curNode){
		if(curNode == null)
			return;
		inOrder(curNode.left);
		System.out.print(curNode.data + " ");
		inOrder(curNode.right);
	}
	
	public void preOrder(){
		System.out.println("Pre Order");
		preOrder(root);
		System.out.println();
	}
	
	public void preOrder(Node curNode){
		if(curNode == null)
			return;
		System.out.print(curNode.data + " ");
		preOrder(curNode.left);
		preOrder(curNode.right);
	}
	
	public void postOrder(){
		System.out.println("Post Order");
		preOrder(root);
		System.out.println();
	}
	
	public void postOrder(Node curNode){
		if(curNode == null)
			return;
		System.out.print(curNode.data + " ");
		postOrder(curNode.left);
		postOrder(curNode.right);
	}
	
	public Node left(){
		current = root.left;
		return current;
	}
	
	public Node right(){
		current = root.right;
		return current;
	}
}

