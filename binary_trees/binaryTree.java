package binary_trees;


public class binaryTree {
	
	public TreeNode root;

	
	public binaryTree(TreeNode root){
		this.root = root;
	}
	
	 TreeNode insertion(TreeNode insert, TreeNode node) {

		if(node.getLeft() == null && node.getRight() == null) {
			node.setLeft(insert);
			return insert;
		}
		else if(node.getLeft() == null && node.getRight() != null) {
			node.setLeft(insert);
			return insert;
		}
		else if(node.getLeft() != null && node.getRight() == null) {
			node.setRight(insert);
			return insert;
		}
		else {
			if(height(node.getLeft()) > height(node.getRight()))
				return insertion(insert, node.getRight());
			else
				return insertion(insert, node.getLeft());
		}
				
		
	}

	 int height(TreeNode node) {
		if(node == null) return -1; //empty tree has height of -1
		else {
			return Math.max(height(node.getLeft()), height(node.getRight()))+1;
		}
	}
	
	 int nodeCount(TreeNode node) {
		if(node.getLeft() == null && node.getRight() == null) return 1;
		
		else if(node.getLeft() == null && node.getRight() != null)
			return nodeCount(node.getRight()) +1;
		
		else if(node.getLeft() != null && node.getRight() == null)
			return nodeCount(node.getLeft()) +1;
		
		else
			return nodeCount(node.getLeft()) + nodeCount(node.getRight()) + 1;
		}
	 
	 	public void postorder(TreeNode node) {
			if(node == null) {
				return;
			}
			else
			{
				postorder(node.getLeft());
				postorder(node.getRight());
				System.out.println(node.val);
			}
		}
	 	
	 	public void inorder(TreeNode node) {
	 		if(node == null) {
				return;
			}
			else
			{
				inorder(node.getLeft());
				System.out.println(node.val);
				inorder(node.getRight());
			}
	 	}
	 	
	 	public void preorder(TreeNode node) {
	 		if(node == null) {
				return;
			}
			else
			{
				System.out.println(node.val);
				inorder(node.getLeft());
				inorder(node.getRight());
			}
	 	}
	 
}

