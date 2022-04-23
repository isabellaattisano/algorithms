package binary_trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
   
   public TreeNode(int val, TreeNode left, TreeNode right){
       this.val = val;
       this.left = left;
       this.right = right;
   }
   
   public TreeNode(int val){
       this.val = val;
   }	
   
   public TreeNode getLeft() {
       return left;
   }
   public TreeNode getRight() {
       return right;
   }
   
   public void setRight(TreeNode right) {
       this.right = right;
   }
   
   public void setLeft(TreeNode left) {
       this.left = left;
   }
}
