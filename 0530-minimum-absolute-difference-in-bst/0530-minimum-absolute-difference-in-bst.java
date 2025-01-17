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
    public static void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root!=null){
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.right,arr);
                
        }
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            mini=Math.min(mini, arr.get(i)-arr.get(i-1));
        }
        return mini;
    }
}