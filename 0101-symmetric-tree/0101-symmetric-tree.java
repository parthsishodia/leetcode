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
       return root == null || isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode num1, TreeNode num2) {
        if (num1 == null && num2 == null) return true;
        
        if (num1== null || num2 == null) return false;
        
        if (num1.val != num2.val) return false;
        return isMirror(num1.left, num2.right) && isMirror(num1.right, num2.left);
    }
}