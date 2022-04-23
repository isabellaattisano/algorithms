package binary_trees;
public class binarySearchTree extends binaryTree{

	public binarySearchTree(TreeNode root) {
		super(root);
	}
	
	public TreeNode insertion(TreeNode insert, TreeNode node) {
		
		if(node == null)
			return insert;
		else if(insert.val <= node.val) {
			node.setLeft(insertion(insert, node.getLeft()));
			return node;
		}
		else
		{
			node.setRight(insertion(insert, node.getRight()));
			return node;
		}
		
	}
	
	public boolean searching(TreeNode find, TreeNode node) {
		if(node == null)
			return false;
		else if(node.val == find.val) {
			return true;
		}
		else
			if(find.val <= node.val)
				return searching(find, node.getLeft());
			else
				return searching(find, node.getRight());
	}
	
	public TreeNode smallestNode(TreeNode node) {
		if(node.getLeft() == null)
			return node;
		else
			return smallestNode(node.getLeft());
	}
	
	public TreeNode largestNode(TreeNode node) {
		if(node.getRight() == null)
			return node;
		else
			return largestNode(node.getRight());
	}

	
	

}
