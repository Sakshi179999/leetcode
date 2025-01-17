/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return ismirror(root.left,root.right);
        
    }
    private boolean ismirror(TreeNode right,TreeNode left){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        return(left.val==right.val) && ismirror(left.left,right.right) && ismirror(left.right,right.left); 
        
    }
}