class Solution {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
        int isCount;
    }
    public TrieNode root=new TrieNode();
    public void insert(String word){
        TrieNode node = root;
        for(char ch:word.toCharArray()){
            int idx= ch-'a';
            if(node.children[idx]==null){
                node.children[idx]=new TrieNode();
                node.isCount+=1;
            }
            node=node.children[idx];
        }
        node.isWord=true;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        for(String word : strs){
            insert(word);
        }
        StringBuilder prefix = new StringBuilder();
        TrieNode curr=root;
        while(curr.isCount==1 && !curr.isWord){
            for(int i=0;i<26;i++){
                if(curr.children[i] !=null){
                    prefix.append((char)('a'+i));
                    curr=curr.children[i];
                    break;
                }
            }
        }
        return prefix.toString();
    }
}