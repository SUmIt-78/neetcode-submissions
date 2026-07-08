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
    int curr=0;

  public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
        if(start>end || curr>=preorder.length)return null;
        int currNum=preorder[curr++];
        int index=-1;
        for(int i=start;i<=end;i++){
            if(inorder[i]==currNum) index=i;
        }

        TreeNode currNode=new TreeNode(currNum);

        currNode.left=buildTree(preorder,inorder,start,index-1);
        currNode.right=buildTree(preorder,inorder,index+1,end);

        return currNode;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,preorder.length-1);
    }
}
