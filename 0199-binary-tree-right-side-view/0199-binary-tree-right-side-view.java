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
    public List<Integer> rightSideView(TreeNode root) {
       if(root == null) return new ArrayList<>();
        
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int n= queue.size();
            
            TreeNode rightNode=null;
            for(int i=0;i<n;i++){
                rightNode=queue.poll();
                
                if (rightNode.left != null) 
                    queue.offer(rightNode.left);
                if (rightNode.right != null) 
                    queue.offer(rightNode.right);
            }
            li.add(rightNode.val);
        }
        return li;
        
        
    }
}