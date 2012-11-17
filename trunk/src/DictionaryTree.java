import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
	private File dictionary;

	/**
	 * 
	 */
	public DictionaryTree() {
		this.root = new Node();
		this.currentNode = new Node();
		this.dictionary = new File("./1-1000.txt");
	}

	public void addWord(String Word){
		Node Nodeptr = root;
		char[] word = Word.toCharArray();
		for (int i = 0; i < word.length; i++){			
			Nodeptr = Nodeptr.addLetter(word[i]);
		}
		root.incCount();
		this.currentNode = new Node(this.root);
	}

	public void createTree(){
		Scanner scan = null;
		try {
			scan = new Scanner(this.dictionary);
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
			// get the probabilities sorted by character			
			float[] probs = this.getProbs();		
			// place these into an array of structs holding chars and probabilities
			LetterProbStruct[] sorted = new LetterProbStruct[currentNode.getN()];
			char temp = 0;
			for(int i = 0; i < currentNode.getN(); i++){
				temp = (char)(i+65);
				if (temp > 90) {
					temp = '\'';
				}
				sorted[i] = new LetterProbStruct(temp, probs[i]); 
			}
			// sort the Array by probability and resolve draws by letter
			Arrays.sort(sorted);
			// remove the 0 probabilities from the array and replace with EOW
			float totalProb = 1;
			boolean EOWset = false;
			for (int i = 0; i < currentNode.getN(); i ++){								
				if (sorted[i].getProb() != 0){
					totalProb -= sorted[i].getProb();					
				} else {					
					if (!EOWset){
						sorted[i] = new LetterProbStruct('_', totalProb);
						EOWset = true;
					} else {
						sorted[i] = null;
					}
				}
			}			
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
		// LetterProbStruct[] sorted = null;
		tree.createTree();

		// tree.processWord("strings");
		tree.processWord("apple");
		// tree.processWord("string");
		tree.processWord("don't");
		tree.processWord("won't");


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
			this.appendToDictionary(Word);
		}
	}

	/**
	 * @param sorted
	 */
	private static void printData(LetterProbStruct[] sorted) {
		if (sorted != null){
			System.out.print("Getting next top (<=)3 most likely letters: ");
			for (int i = 0; i < 3; i ++){
				if (sorted[i] != null && sorted[i].getProb() != 0){
					System.out.print(" " + sorted[i].getLetter());
				}
			}
			System.out.println();

			for (int i = 0; i < 3; i ++){
				if (sorted[i] != null && sorted[i].getProb() != 0){
					System.out.print("P[" + sorted[i].getLetter() + "]=" + sorted[i].getProb() + "; ");
				}
			}
			System.out.println();
			
		} else {
			System.out.println("Outside of tree of 1000 most used words");
		}
	}

	private void appendToDictionary(String word){
		FileWriter fileWritter;
		try {
			fileWritter = new FileWriter(this.dictionary.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n" + word);
			bufferWritter.close();
		} catch (IOException e) {
			// shit broke...
			e.printStackTrace();
		}

	}
}
