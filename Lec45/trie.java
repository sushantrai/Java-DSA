package Lec45;
import java.util.HashMap;
public class trie {
    public class Node {
		char ch;
		HashMap<Character, Node> children = new HashMap<>();
		boolean istreminal;

		public Node(char ch) {
			this.ch = ch;
			istreminal = false;
		}
	}

	private Node root;

	public trie() {

		this.root = new Node('*');
	}

	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(curr.children.containsKey(ch)) {
				curr=curr.children.get(ch);
			}
			else {
				Node node = new Node(ch);
				curr.children.put(ch, node);
				curr=node;
			}
			
		}
		curr.istreminal=true;

	}
	
	  public boolean search(String word) {
		  Node curr = this.root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if(!curr.children.containsKey(ch)) {
					return false;
				}
				curr=curr.children.get(ch);
				
				
			}
			return curr.istreminal;
	    }
	  
	  public boolean startsWith(String prefix) {
		  Node curr = this.root;
			for (int i = 0; i < prefix.length(); i++) {
				char ch = prefix.charAt(i);
				if(!curr.children.containsKey(ch)) {
					return false;
				}
				curr=curr.children.get(ch);
				
				
			}
			return true;
	    }

}
