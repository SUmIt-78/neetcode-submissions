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

    int max=0;

    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if(root==null)return 0;
        int diaLeft=diameterOfBinaryTreeHelper(root.left);
        int diaRight=diameterOfBinaryTreeHelper(root.right);
        int sum=diaLeft+diaRight+1;
        max=Math.max(sum,max);
        return Math.max(diaLeft,diaRight)+1;
    }


    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeHelper(root);
        return max-1;
    }
}
