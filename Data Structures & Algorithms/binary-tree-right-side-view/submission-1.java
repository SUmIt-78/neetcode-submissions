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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root==null)return res;
        queue.offer(root);
         while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode tn=queue.poll();
                if(i==size-1)res.add(tn.val);
                if(tn.left!=null)queue.offer(tn.left);
                if(tn.right!=null)queue.offer(tn.right);
            }
         }
         return res;
    }
}
