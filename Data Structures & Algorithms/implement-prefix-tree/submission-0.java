
  class TrieNode{
    TrieNode[] children;
    boolean isEnd;
    public TrieNode(){
        this.children=new TrieNode[27];
    }
 }







class PrefixTree {

    TrieNode root;

    public PrefixTree() {
         root=new TrieNode();
    }

    public void insert(String word) {
         TrieNode temp=root;
         for(int i=0;i<word.length();i++){
            if(temp.children[word.charAt(i)-'a']!=null){
                temp=temp.children[word.charAt(i)-'a'];
            }else{
                TrieNode curr=new TrieNode();
                temp.children[word.charAt(i)-'a']=curr;
                temp=curr;
            }
         }
         temp.isEnd=true;
    }

    public boolean search(String word) {
       TrieNode temp=root;
       for(int i=0;i<word.length();i++){
           if(temp.children[word.charAt(i)-'a']==null)return false;
           temp=temp.children[word.charAt(i)-'a'];
       }
       return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
           TrieNode temp=root;
       for(int i=0;i<prefix.length();i++){
           if(temp.children[prefix.charAt(i)-'a']==null)return false;
           temp=temp.children[prefix.charAt(i)-'a'];
       }
       return true;
    }
}
