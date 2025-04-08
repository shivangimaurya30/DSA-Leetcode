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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Integer> left=postorderTraversal(root.left);
        List<Integer> right=postorderTraversal(root.right);
        result.addAll(left);
        result.addAll(right);
        result.add(root.val);
        return result;
    }
}
