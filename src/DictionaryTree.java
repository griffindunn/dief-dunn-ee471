import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
	private Node currentNode;
	/**
	 * 
	 */
	public DictionaryTree() {
		this.root = new Node();
		this.currentNode = new Node();
	}

	public void addWord(String Word){
		Node Nodeptr = root;
		char[] word = Word.toCharArray();
		for (int i = 0; i < word.length; i++){			
			Nodeptr = Nodeptr.addLetter(word[i]);
		}
		root.incCount();
		// keep root and currentNode the same
		this.currentNode = new Node(this.root);
	}

	public void createTree(){
		Scanner scan = null;
		try {
			scan = new Scanner(new File("./1-1000.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}

		while(true){
			try {
				this.addWord(scan.nextLine());												
			} catch (NoSuchElementException ex) {
				break;
			}
		}		
	}

	public void resetToRoot(){
		this.currentNode = new Node(this.root);
	}
	
	public void traverse(char letter){
		if (currentNode != null){
			this.currentNode = currentNode.getNode(letter);
		}
	}

	private float[] getProbs() {
		return currentNode.getProbs();
	}

	private LetterProbStruct[] getSorted() {		
		if (currentNode != null){
			float[] probs = this.getProbs();		
			LetterProbStruct[] sorted = new LetterProbStruct[currentNode.getN()];

			for(int i = 0; i < currentNode.getN(); i ++){
				sorted[i] = new LetterProbStruct((char)(i+65), probs[i]); 
			}
			Arrays.sort(sorted);
			return sorted;
		} else {
			return null;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Begin Program");
		
		DictionaryTree tree = new DictionaryTree();
		LetterProbStruct[] sorted = null;
		tree.createTree();

		tree.processWord("strings");
		tree.processWord("apple");
		tree.processWord("strings");
		tree.processWord("don't");
		
		
		System.out.println("Done");
	}

	/**
	 * @param tree
	 * @param Word
	 */
	public void processWord(String Word) {
		this.resetToRoot();
		System.out.println("\n===========================================");
		System.out.println("Processing Word: " +  Word + "\n");
		LetterProbStruct[] sorted;
		sorted = this.getSorted();
		printData(sorted);		
		char[] word = Word.toCharArray();

		for (int i = 0; i < word.length; i ++){
			System.out.println("\nTraversing to :" + word[i]);
			this.traverse(word[i]);
			sorted = this.getSorted();
			printData(sorted);
		}
		
		if (this.currentNode == null){
			this.addWord(Word);
		}
	}

	/**
	 * @param sorted
	 */
	private static void printData(LetterProbStruct[] sorted) {
		if (sorted != null){
			System.out.print("Getting next top 3 most likely letters: ");
			System.out.println(sorted[0].getLetter() + " " + sorted[1].getLetter() + " " + sorted[2].getLetter());
			System.out.print("P[" + sorted[0].getLetter() + "]=" + sorted[0].getProb() + "; ");
			System.out.print("P[" + sorted[1].getLetter() + "]=" + sorted[1].getProb() + "; ");
			System.out.print("P[" + sorted[2].getLetter() + "]=" + sorted[2].getProb() + ";\n");
		} else {
			System.out.println("Outside of tree of 1000 most used words");
		}
	}
}
