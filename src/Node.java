/**
 * 
 */

/**
 * @author prd005
 * 
 */
public class Node {
	private final int N = 27;

	private char letter;
	private int count;
	private Node[] list;

	/**
	 * 
	 */
	public Node(char letter) {
		this.letter = letter;
		this.count = 0;
		list = new Node[N];
	}

	public Node() {
		this.letter = '?';
		this.count = 0;
		list = new Node[N];
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param n
	 */
	public Node(Node n){
		this.letter = n.letter;
		this.count = n.count;
		this.list = n.list;
	}

	/**
	 * @param letter
	 * @return a pointer to the next Node of the tree
	 */
	public Node addLetter(char letter){
		int index = 0;
		if (letter == '\'') { // ' is a special case and stored in index 27
			index = 26;
		} else {
			index = Character.toUpperCase(letter) - 65;
		}
		Node Nodeptr = null;
		try {
			Nodeptr = this.list[index];
		}catch (Exception ex) {
			System.err.println(letter);
			ex.printStackTrace();

			System.exit(1);
		}
		if (Nodeptr == null) {
			Nodeptr = new Node(Character.toUpperCase(letter));
		}
		Nodeptr.count ++;	
		this.list[index] = Nodeptr;
		return Nodeptr;
	}

	public int getCount(){
		return this.count;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int incCount(){
		return ++this.count;
	}
	
	public int getN(){
		return this.N;
	}

	public void SetNode(int index, Node nodeptr){
		this.list[index] = nodeptr;
	}

	public float[] getProbs(){
		float probs[] = new float[N];
		
		for (int i = 0; i < N; i++){
			if (list[i] == null){
				probs[i] = 0;
			} else {
				probs[i] = (float) list[i].count/ this.count;	
			}
		}
		
		return probs;
	}
	
	public Node getNode(char letter){
		int index = Character.toUpperCase(letter) - 65;
		if (index < 0){
			index = 26;
		}
		return this.list[index];
	}
	
	/**
	 * Scratch pad for testing stuff
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		//		System.out.println(Character.toUpperCase('A') - 65);
		//		System.out.println(Character.toUpperCase('B') - 65);
		//		System.out.println(Character.toUpperCase('a') - 65);

		int i = 0;

		System.out.println(i++);
		System.out.println(++i);
	}

}
