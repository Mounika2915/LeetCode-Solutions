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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         
        List<List<Integer>> lis = new ArrayList<>();
        if(root == null) return lis;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isTrue = true ;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i = 0 ; i < size ;i++){
                TreeNode node = q.remove() ;
                curr.add(node.val) ; 
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if(isTrue){
                lis.add(curr) ;
                isTrue = false ; 
            }else{
                Collections.reverse(curr);
                lis.add(curr);
                isTrue = true ; 
            }
        }
        return lis ;
    }
}