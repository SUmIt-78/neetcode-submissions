/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    Map<Integer,Node> clones=new HashMap<>();

   public void cloneGraph(Node node, boolean[] visited) {
    if(visited[node.val])return;
    visited[node.val]=true;
        if(clones.get(node.val)==null){
            clones.put(node.val,new Node(node.val));
        }
        for(Node child:node.neighbors){
            if(clones.get(child.val)==null){
                clones.put(child.val,new Node(child.val));
            }
            Node currChild=clones.get(child.val);
            Node par=clones.get(node.val);
            par.neighbors.add(currChild);
            cloneGraph(child,visited); 
        }
    }

    public Node cloneGraph(Node node) {
        if(node==null)return node;
        boolean[] visited=new boolean[101];
        cloneGraph(node,visited);
        return clones.get(1);
    }
}