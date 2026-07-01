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

  public TreeNode invertTreeHelper(TreeNode root) {
        if(root==null)return root;
        TreeNode right=invertTreeHelper(root.right);
        TreeNode left=invertTreeHelper(root.left);
        root.right=left;
        root.left=right;
        return root;
    }







    public TreeNode invertTree(TreeNode root) {
        return invertTreeHelper(root);
    }
}
