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
    static int max = Integer.MIN_VALUE ;
    private int height(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int lh = Math.max(height(root.left), 0 );
        int rh = Math.max(height(root.right)  , 0) ;
        max = Math.max(max , lh + rh + root.val) ;
        return root.val + Math.max(lh ,rh);
    }
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE ;
        height(root);
        return max ; 
    }
}