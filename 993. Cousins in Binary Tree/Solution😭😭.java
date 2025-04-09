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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root==null) return false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size=queue.size();
            boolean x_found=false;
            boolean y_found=false;
            for (int i=0;i<size;i++) {
                TreeNode node=queue.poll();
                if (node.left !=null && node.right!=null) {
                    if ((node.left.val==x && node.right.val==y) ||
                        (node.left.val==y && node.right.val==x)) {
                        return false;                     }
                }
                if (node.val==x)x_found=true;
                if (node.val==y)y_found=true;
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            if (x_found&& y_found) return true;
            if (x_found|| y_found) return false;
        }
        return false; 
    }
}
