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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if (root==null) return null;
        
        if(root.val<key){
           root.right=deleteNode(root.right,key); 
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{ //case 1 for leaf node
            if(root.left==null && root.right==null) return null;
            
            //case 2 node has single child
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            
            /*case 3 node have 2 children*/
            else{
                TreeNode IS = findIS(root.right);
                root.val=IS.val;
                root.right=deleteNode(root.right,IS.val);
            }
            
            
        }
        return root;
    }
    public static TreeNode findIS(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    
   
}