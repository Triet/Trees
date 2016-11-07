package bst;

public class Main {
	public static void main(String[] args){
		Tree tree = new Tree();
		int [] values = {5,4,2,6,1,29,23,84,54,25,18,14,8};
		//int [] values = {3,5,2,1};

		for(int value : values)
			tree.insert(value);
		
		System.out.println("Original");
		for(int value : values){
			System.out.print(value + " ");
		}
		System.out.println();
		tree.inOrder();
		tree.preOrder();
		tree.postOrder();
	}
}
