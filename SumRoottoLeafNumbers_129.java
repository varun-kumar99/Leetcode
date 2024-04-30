package Leetcode;

public class SumRoottoLeafNumbers_129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public class TreeNode {
		    int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		        this.val = val;
		        this.left = left;
		          this.right = right;
		     }
		  }
	
		class Solution {
		    public int sumNumbers(TreeNode root) {
		        return sum(root, 0);

				}

				public int sum(TreeNode root, int n) {
					if (root == null) {
						return 0;
					}

					if (root.left == null && root.right == null) {
						return n * 10 + root.val;
					}
					int ln = sum(root.left, n * 10 + root.val);
					int rn = sum(root.right, n * 10 + root.val);
					return ln + rn;

				}

}
}
