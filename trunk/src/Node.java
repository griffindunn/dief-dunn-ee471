/**
 * Bucknell University ELEC 471
 * Philip Diefenderfer and Griffin Dunn
 * Probabilistic Typing on Touch Input Devices
 */

/**
 * Node class for the dictionary tree containing the letter stored at this node,
 * the number of letters stored at this node, and an array of Nodes pointed to
 * by this node containing subsequent letters.
 * 
 * @author prd005
 * 
 */
public class Node {
	/**
	 * The number of characters to be stored (A-Z ' and _)
	 */
	private final int N = 28;
	/**
	 * The letter sorted at this node
	 */
	private char letter;
	/**
	 * The number of letters that use this node
	 */
	private int count;
	/**
	 * The Array of pointers to subsequent letters
	 */
	private Node[] list;

	/**
	 * Creates a new node containing the parameter letter
	 * 
	 * @param letter
	 *            the letter stored at this node
	 */
	public Node(char letter) {
		this.letter = letter;
		this.count = 0;
		list = new Node[N];
	}

	/**
	 * Creates a root Node
	 */
	public Node() {
		this.letter = '?';
		this.count = 0;
		list = new Node[N];
	}

	/**
	 * Copy constructor to create a new Node object with the same properties as
	 * the parameter Node
	 * 
	 * @param n
	 *            the node to be copied
	 */
	public Node(Node n) {
		this.letter = n.letter;
		this.count = n.count;
		this.list = n.list;
	}

	/**
	 * Adds a letter to the tree at the current Node. Increments the count if a
	 * node for the new letter exists otherwise creates a new node
	 * 
	 * @param letter
	 *            the letter to be added to the tree at this node
	 * @return a pointer to the next Node
	 */
	public Node addLetter(char letter) {
		int index = 0;
		if (letter == '\'') { // ' is a special case and stored in index 27
			index = 26;
		} else if (letter == '_') {
			index = 27;
		} else {
			index = Character.toUpperCase(letter) - 65;
		}

		// why is this a try?
		// TODO prd005
		// Node Nodeptr = null;
		// try {
		// Nodeptr = this.list[index];
		// } catch (Exception ex) {
		// System.err.println(letter);
		// ex.printStackTrace();
		// System.exit(1);
		// }
		Node Nodeptr = this.list[index];

		if (Nodeptr == null) {
			Nodeptr = new Node(Character.toUpperCase(letter));
		}
		Nodeptr.count++;
		this.list[index] = Nodeptr;
		return Nodeptr;
	}

	/**
	 * Gets the number of words that use this node
	 * 
	 * @return the number of words that used this Node
	 */
	public int getCount() {
		return this.count;
	}

	/**
	 * Sets the count at the Node
	 * 
	 * @param count
	 *            the count to be set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Increments the count at the Node
	 * 
	 * @return the count at the node
	 */
	public int incCount() {
		return ++this.count;
	}

	/**
	 * Gets the number of possible letters
	 * 
	 * @return the value of N
	 */
	public int getN() {
		return this.N;
	}

	/**
	 * Sets the current Node's Array of Nodes at parameter index to the
	 * parameter Node
	 * 
	 * @param index
	 *            the index to store the parameter node at
	 * @param nodeptr
	 *            the node to be stored
	 */
	public void SetNode(int index, Node nodeptr) {
		this.list[index] = nodeptr;
	}

	/**
	 * Gets an Array of probabilities for the subsequent letters
	 * 
	 * @return the probabilities for each character of the tree
	 */
	public float[] getProbs() {
		float probs[] = new float[N];

		for (int i = 0; i < N; i++) {
			if (list[i] == null) {
				probs[i] = 0;
			} else {
				probs[i] = (float) list[i].count / this.count;
			}
		}

		return probs;
	}

	/**
	 * Gets the Node that corresponds to the parameter letter
	 * 
	 * @param letter
	 *            the letter to return the Node for
	 * @return the Node for the parameter letter
	 */
	public Node getNode(char letter) {
		int index = Character.toUpperCase(letter) - 65;
		if (letter == '\'') {
			index = 26;
		} else if (letter == '_') {
			index = 27;
		}
		return this.list[index];
	}

	/**
	 * Scratch pad for testing stuff
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		// System.out.println(Character.toUpperCase('A') - 65);
		// System.out.println(Character.toUpperCase('B') - 65);
		// System.out.println(Character.toUpperCase('a') - 65);

		int i = 0;

		System.out.println(i++);
		System.out.println(++i);
	}

}
