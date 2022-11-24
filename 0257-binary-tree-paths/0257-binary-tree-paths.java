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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList();
        if(root==null)
        return res;
        String current_path = Integer.toString(root.val);
        if(root.left==null && root.right==null)
        res.add(current_path);
        if(root.left!=null)
        dfs(root.left,current_path,res);
        if(root.right!=null)
            dfs(root.right,current_path,res);
        return res;
    }
        public void dfs(TreeNode node,String current_path,List<String> res)
        {   
            
            current_path=current_path+"->"+node.val;
            if(node.left==null && node.right==null)
            {
                res.add(current_path);
                return;
            }
            if(node.left!=null)
                dfs(node.left,current_path,res);
            if(node.right!=null)
                dfs(node.right,current_path,res);
        }
    }