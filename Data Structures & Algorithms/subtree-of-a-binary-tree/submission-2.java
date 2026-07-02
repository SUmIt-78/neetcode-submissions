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

    public void inOrder(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append('#');
            return;
        }
        sb.append(root.val);
        inOrder(root.left,sb);
        inOrder(root.right,sb);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        inOrder(root,sb1);
        inOrder(subRoot,sb2);
        return sb1.indexOf(sb2.toString())==-1 ? false:true;
    }
}
