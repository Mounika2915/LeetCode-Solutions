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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lis = new ArrayList<>();
        if(root == null){
            return lis ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root) ;
        while(!q.isEmpty()){
            List<TreeNode> curr = new ArrayList<>();
            while(!q.isEmpty()){
                curr.add(q.remove());
            }
            List<Integer> res = new ArrayList<>();
            for(TreeNode node : curr){
                res.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            lis.add(res) ;
        }
        return lis ;
    }
}