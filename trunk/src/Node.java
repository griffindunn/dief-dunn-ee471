/**
 * 
 */

/**
 * @author prd005
 * 
 */
public class Node {
	private char letter;
	private int count;
	private Node[] list;
	
	/**
	 * 
	 */
	public Node(char letter) {
		this.letter = letter;
		this.count = 0;
		list = new Node[26];
	}
	
	public Node() {
		this.letter = '?';
		this.count = 0;
		list = new Node[26];
	}

	/**
	 * @param letter
	 * @return a pointer to the next Node of the tree
	 */
	public Node addLetter(char letter){
		int index = Character.toUpperCase(letter) - 65;
		Node Nodeptr = this.list[index];
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
	
	public void SetNode(int index, Node nodeptr){
		this.list[index] = nodeptr;
	}
	
	/**
	 * @param args
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
