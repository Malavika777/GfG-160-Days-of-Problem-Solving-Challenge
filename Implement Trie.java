class Trie {
    class TrieNode{
        TrieNode[] ch=new TrieNode[26];
        boolean end=false;
    }
    public TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    public void insert(String word) {
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(node.ch[idx]==null) node.ch[idx]=new TrieNode();
            node=node.ch[idx];
        }
        node.end=true;
    }
    public boolean search(String word) {
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(node.ch[idx]==null) return false;
            node=node.ch[idx];
        }
        return node.end;
    }
    public boolean isPrefix(String word) {
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(node.ch[idx]==null) return false;
            node=node.ch[idx];
        }
        return true;
    }
}
