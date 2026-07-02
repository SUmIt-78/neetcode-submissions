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
    public boolean isValidBST(TreeNode root, int minSoFar, int maxSoFar) {
        if(root==null)return true;
        if(root.val>=maxSoFar || root.val<=minSoFar)return false;
        return isValidBST(root.left,minSoFar,root.val) && isValidBST(root.right,root.val,maxSoFar);

    }

    public boolean isValidBST(TreeNode root){
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
