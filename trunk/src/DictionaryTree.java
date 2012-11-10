/**
 * 
 */

/**
 * @author prd005
 *
 */
public class DictionaryTree {
	private Node root;
	/**
	 * 
	 */
	public DictionaryTree() {
		this.root = new Node();
	}

	public void addWord(String Word){
		Node Nodeptr = root;
		char[] word = Word.toCharArray();
		for (int i = 0; i < word.length; i++){			
			Nodeptr = Nodeptr.addLetter(word[i]);
		}
		root.incCount();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DictionaryTree root = new DictionaryTree();
		root.addWord("the");
		root.addWord("these");
		root.addWord("this");
		root.addWord("two");
		root.addWord("apple");
		System.out.println("Break");
	}

}
