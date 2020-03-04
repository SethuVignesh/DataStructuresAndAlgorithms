package Trees;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class Tries {
    public TrieNode root;
    public Tries(){
        root=  new TrieNode();
    }
    public void insert(String word){
        HashMap<Character, TrieNode> children= root.children;
        TrieNode t;
        for (int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(children.containsKey(c)){
                t=children.get(c);
            }else{
                t = new TrieNode(c);
                children.put(c,t);
            }
            children=t.children;

            if(i ==(word.length()-1)){
                t.isLeaf=true;
            }
        }
    }
    public boolean search(String word){
        TrieNode t= searchNode(word);
        if(t!=null && t.isLeaf) return true;
        else return false;

    }
    public boolean startsWith(String prefix){
        if(searchNode(prefix)!=null) return true;
        return false;
    }
    public  TrieNode searchNode(String str){

        HashMap<Character, TrieNode> children= root.children;
        TrieNode t=null;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(children.containsKey(c)){
                t= children.get(c);
                children= t.children;
            }else {
                return null;

            }
        }
        return t;
    }

}
class TrieNode{
    char c;
    HashMap<Character, TrieNode> children=  new HashMap<Character, TrieNode>();
    boolean isLeaf;
    public TrieNode(){}
    public TrieNode(char c){
        this.c=c;
    }
}

/*
class Node(){
Node root = new Node('')
  Node (char data) {
    this.data=data;
  }
  char data ;
  HashMap<Character,Node> childNode= new HashMap<Character, Node>();
  boolean isLast;
  int dictionarySize;

}

class Tries{
  public boolean insert(String str){
  if(root.childNode.contains(str.charAt(0))){
  }else{
  Node temp= root;

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        Node node = new Node (ch);
        temp.childNode.add(ch, node);
        temp=temp.childNode.get(ch);
        if(i=str.length()-1){
        temp.isLast=true;
        size=size+1;
        }
    }
  }
  }
  public String get(String str){
    Node temp=root;
    for(int i=0;i<str.length();i++){
        if(temp.childNode.contains(str.charAt(i))){
         temp =temp.childNode.get(str.charAt(i));

        }else{
        break;
        }
        return temp.childNode;
    }
  }
  public boolean delete(String str){
    Node temp =root;
    for(int i=0;i<str.length();i++){
    if (temp.childNode.contains (str.charAt(i)){
        temp=temp.childNode.get(str.charAt(i))
    }else{

    }
    }
    if(temp.childNode.size>0) temp.isLast=false;
    else{

    }
  }



  public void delete(Node temp, char ch){
  if(temp.next=null) return ;

      delete(temp.childNode.get(ch) );
    temp.next= null;

  }
}
 */