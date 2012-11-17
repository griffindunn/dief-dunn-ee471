import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Bucknell University ELEC 471
 * Philip Diefenderfer and Griffin Dunn
 * Probabilistic Typing on Touch Input Devices
 */

/**
 * This class implements a Tree Abstract Data Type using the Node class. This
 * class imports words from a text file and creates a tree from the imported
 * words storing at each letter the number of words that use that node and a
 * pointer to the nodes for all letters occurring after the previous letter.
 * This creates a traversable tree that can be used to calculate the probability
 * of each sequential letter.
 * 
 * @author prd005
 */
public class DictionaryTree {
	/**
	 * The root node of the dictionary tree
	 */
	private Node root;
	/**
	 * The current Node that the tree has traversed to
	 */
	private Node currentNode;
	/**
	 * The dictionary file from which the tree is created
	 */
	private File dictionary;

	/**
	 * Constructs a Dictionary Tree using the dictionary file and places the
	 * current node and root node at the root of the tree.
	 */
	public DictionaryTree() {
		this.root = new Node();
		this.currentNode = new Node();
		this.dictionary = new File("./1-1000.txt");
		this.createTree();
	}

	/**
	 * Adds a word to the tree and updates the counts at each node
	 * 
	 * @param Word
	 *            the word to be added to the tree
	 */
	public void addWord(String Word) {
		Node Nodeptr = root;
		char[] word = Word.toCharArray();
		for (int i = 0; i < word.length; i++) {
			Nodeptr = Nodeptr.addLetter(word[i]);
		}
		root.incCount();
		// reset current Node to the root
		this.currentNode = new Node(this.root);
	}

	/**
	 * Creates the tree using the dictionary file
	 */
	private void createTree() {
		Scanner scan = null;
		try {
			scan = new Scanner(this.dictionary);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}

		while (true) {
			try {
				this.addWord(scan.nextLine());
			} catch (NoSuchElementException ex) {
				break;
			}
		}
	}

	/**
	 * Moves the current Node pointer back to the root node to reset the tree
	 */
	public void resetToRoot() {
		this.currentNode = new Node(this.root);
	}

	/**
	 * Moves the current node to the next node that corresponds to the parameter
	 * letter.
	 * 
	 * @param letter
	 *            the letter of the Node to traverse to
	 */
	public void traverse(char letter) {
		if (currentNode != null) {
			this.currentNode = currentNode.getNode(letter);
		}
	}

	/**
	 * Gets the Probabilities of all nodes that the current node points to
	 * 
	 * @return an array sorted by letter for the probabilities of the leaf nodes
	 */
	private float[] getProbs() {
		return currentNode.getProbs();
	}

	/**
	 * Sorts all of the letters and the probabilities by probability and returns
	 * this data in the form of a struct containing the letter and the
	 * probability.
	 * 
	 * @return a sorted array containing all letters that have a probability
	 *         that ends on an _ with all subsequent values set to null
	 */
	public LetterProbStruct[] getSorted() {
		if (currentNode != null) {
			// get the probabilities sorted by character
			float[] probs = this.getProbs();
			// place these into an array of structs holding chars and
			// probabilities
			LetterProbStruct[] sorted = new LetterProbStruct[currentNode.getN()];
			char temp = 0;
			for (int i = 0; i < currentNode.getN(); i++) {
				temp = (char) (i + 65);
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
			for (int i = 0; i < currentNode.getN(); i++) {
				if (sorted[i].getProb() != 0) {
					totalProb -= sorted[i].getProb();
				} else {
					if (!EOWset) {
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
	 * A main program used for testing the Dictionary tree class by traversing
	 * the tree and printing the top 3 (or less) next letters
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		System.out.println("Begin Program");

		DictionaryTree tree = new DictionaryTree();
		// LetterProbStruct[] sorted = null;

		// tree.processWord("strings");
		tree.processWord("apple");
		// tree.processWord("string");
		tree.processWord("don't");
		tree.processWord("won't");

		System.out.println("Done");
	}

	/**
	 * Processes a word by iteratively predicting each probability of the next
	 * letter and then moving to the correct next letter in the word and
	 * repeating until the end of the word. Also adds words that are unknown to
	 * the dictionary.
	 * 
	 * @param Word
	 *            the word to be processed
	 */
	private void processWord(String Word) {
		this.resetToRoot();
		System.out.println("\n===========================================");
		System.out.println("Processing Word: " + Word + "\n");
		LetterProbStruct[] sorted;
		sorted = this.getSorted();
		printData(sorted);
		char[] word = Word.toCharArray();

		for (int i = 0; i < word.length; i++) {
			System.out.println("\nTraversing to :" + word[i]);
			this.traverse(word[i]);
			sorted = this.getSorted();
			printData(sorted);
		}

		if (this.currentNode == null) {
			this.addWord(Word);
			this.appendToDictionary(Word);
		}
	}

	/**
	 * Prints the top 3 (or less) letters that have the highest probability of
	 * being selected next. Will print less if there are less than 3 probable
	 * letters or an end of word condition exists
	 * 
	 * @param sorted
	 *            the sorted Array of probabilities and letters to print to the
	 *            console
	 */
	private static void printData(LetterProbStruct[] sorted) {
		if (sorted != null) {
			System.out.print("Getting next top (<=)3 most likely letters: ");
			for (int i = 0; i < 3; i++) {
				if (sorted[i] != null && sorted[i].getProb() != 0) {
					System.out.print(" " + sorted[i].getLetter());
				}
			}
			System.out.println();

			for (int i = 0; i < 3; i++) {
				if (sorted[i] != null && sorted[i].getProb() != 0) {
					System.out.print("P[" + sorted[i].getLetter() + "]="
							+ sorted[i].getProb() + "; ");
				}
			}
			System.out.println();

		} else {
			System.out.println("Outside of tree of 1000 most used words");
		}
	}

	/**
	 * Appends a new word to the end of the dictionary file
	 * 
	 * @param word
	 *            Adds a word to the dictionary file to be stored in the file
	 *            for future runs
	 */
	private void appendToDictionary(String word) {
		FileWriter fileWritter;
		try {
			fileWritter = new FileWriter(this.dictionary.getName(), true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n" + word);
			bufferWritter.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

	}
}
