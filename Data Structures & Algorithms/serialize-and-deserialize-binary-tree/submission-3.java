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

public class Codec {
     List<String> preOrder=new ArrayList<>();
     String[] pre=null;
     int index=0;
    // Encodes a tree to a single string.
    public void preOrder(TreeNode root){
        if(root==null){
            preOrder.add("#");
            return;
        }
        preOrder.add(String.valueOf(root.val));
        preOrder(root.left);
        preOrder(root.right);
    }


    public String serialize(TreeNode root) {
        preOrder(root);
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(String n:preOrder){
            sb.append(n);
            if(count++!=preOrder.size()-1)sb.append(",");
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         pre=data.split(",");
        if(pre[index].equals("#")){
            index++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.valueOf(pre[index++]));
        node.left=deserialize(data);
        node.right=deserialize(data);
        return node;
    }
}
