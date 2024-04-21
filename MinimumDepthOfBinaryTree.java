package Leetcode;
import java.util.*;
public class MinimumDepthOfBinaryTree {

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
		   public int minDepth(TreeNode root) {
		        int depth = 1;
		        
		        //Null node has 0 depth.
		        if(root == null)
		            return 0;
		        
		        // Initialize a list to be used a queue with the root.
		        Queue<TreeNode> que = new LinkedList();
		        que.add(root);
		        
		        //Level order traversal algorithm:
		        while(!que.isEmpty()){
		            int size = que.size();
		            while(size>0){
		                // Get the node at the front of the queue.
		                TreeNode node =que.poll();
		                
		                // If this is the first leaf node encountered,
		                // return its depth and terminate the algorithm.
		                if(node.left == null && node.right ==null)
		                    return depth;
		                
		                // If left subtree exists, add it to queue 
		                if(node.left != null)
		                    que.add(node.left);
		                
		                //If right subtree exists, add it to queue 
		                if(node.right != null)
		                    que.add(node.right);
		                size--;
		            }
		            depth++;
		        }
		        return depth;
		   }

}}
