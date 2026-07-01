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
    public int isBalancedHlper(TreeNode root) {
        if(root==null)return 0;
        int left=isBalancedHlper(root.left);
        int right=isBalancedHlper(root.right);
        if(Math.abs(left-right)>1 || left==-1 || right==-1){
            return -1;
        }
        return 1+Math.max(left,right);
        
    }
    public boolean isBalanced(TreeNode root) {
        if(isBalancedHlper(root)==-1)return false;
        return true;
        
    }
}
