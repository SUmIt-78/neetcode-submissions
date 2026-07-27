
class TrieNode{
    TrieNode[] children;
    boolean isEnd;
    public TrieNode(){
        this.children=new TrieNode[27];
    }
}


class WordDictionary {

    TrieNode root;

    public WordDictionary() {
          root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            if(temp.children[word.charAt(i)-'a']!=null){
                temp=temp.children[word.charAt(i)-'a'];
            }else{
                TrieNode node=new TrieNode();
                temp.children[word.charAt(i)-'a']=node;
                temp=node;
            }
        }
        temp.isEnd=true;
    }
   

    public boolean search(String word, int i, TrieNode curr) {
          if(i>=word.length() && curr.isEnd)return true;
           if(i>=word.length() && !curr.isEnd)return false;
           if(word.charAt(i)!='.' && curr.children[word.charAt(i)-'a']==null)return false;
           if(word.charAt(i)=='.'){
            boolean res=false;
             for(TrieNode child:curr.children){
                if(child!=null){
                    res=res||search(word,i+1,child);
                }

             }
             return res;
           }
           return search(word,i+1,curr.children[word.charAt(i)-'a']);
    }

    public boolean search(String word) {
        return search(word,0,root);
    }
}
