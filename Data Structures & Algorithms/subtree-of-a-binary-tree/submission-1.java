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
   public TreeNode findRoot(TreeNode root, TreeNode subRoot){
    if(root==null)return null;
    if(root.val==subRoot.val)return root;
    TreeNode resLeft=findRoot(root.left,subRoot);
    TreeNode resRight=findRoot(root.right,subRoot);
    return resLeft!=null? resLeft:resRight;
   }
   
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q!=null)return false;
        if(q==null && p!=null)return false;
        if(p==null && q==null)return true;
        if(p.val!=q.val)return false;
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
         if(isSameTree(root,subRoot))return true;
         return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
    }
}
