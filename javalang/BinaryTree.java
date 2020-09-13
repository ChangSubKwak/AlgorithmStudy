package javalang;

public class BinaryTree {
	
	public void preOrder(Node node) {
		if (node == null) return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if (node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	public static void main(String[] args) {
		Node[] node = new Node[16];
		
		for(int i = 0 ; i < node.length ; i++) {
			node[i] = new Node();
			node[i].data = i;
		}

		for(int i = 1 ; i < node.length ; i++) {
		    if (i%2 == 0) node[i/2].left = node[i];
		    else          node[i/2].right = node[i];
        }
		
		/*
		node[1].left = node[2];		node[1].right = node[3];
		node[2].left = node[4];		node[2].right = node[5];
		node[4].left = node[8];		node[4].right = node[9];
		node[5].left = node[10];	node[5].right = node[11];
		node[3].left = node[6];		node[3].right = node[7];
		node[6].left = node[12];	node[6].right = node[13];
		node[7].left = node[14];	node[7].right = node[15];
		*/
		
		BinaryTree bt = new BinaryTree();
		bt.preOrder(node[1]);
		System.out.println();
		bt.inOrder(node[1]);
		System.out.println();
		bt.postOrder(node[1]);
	}
}

class Node {
	int data;
	Node left = null;
	Node right = null;
}
