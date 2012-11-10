import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
		Scanner scan = null;
		try {
			scan = new Scanner(new File("./1-1000.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Nueman says: You didn't say the magic word");
			System.exit(1);
		}

		while(true){
			try {
				root.addWord(scan.nextLine());												
			} catch (NoSuchElementException ex) {
				break;
			}
		}
		//		root.addWord("the");
		//		root.addWord("these");
		//		root.addWord("this");
		//		root.addWord("two");
		//		root.addWord("apple");
		System.out.println("Done");
	}

}
