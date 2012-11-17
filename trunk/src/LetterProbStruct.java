/**
 * Bucknell University ELEC 471
 * Philip Diefenderfer and Griffin Dunn
 * Probabilistic Typing on Touch Input Devices
 */

/**
 * Class to hold a letter and its probability of being selected next. Implements
 * Comparable to allow for sorting to be done by Arrays class for easier
 * programming
 * 
 * @author prd005
 */
public class LetterProbStruct implements Comparable<LetterProbStruct> {

	/**
	 * The Object's letter that the probability corresponds to
	 */
	private char letter;
	/**
	 * The probability of the letter being selected next
	 */
	private float prob;

	/**
	 * Creates an object containing the letter and its probability
	 * 
	 * @param letter
	 *            the letter to be stored
	 * @param prob
	 *            the letter's probability
	 */
	public LetterProbStruct(char letter, float prob) {
		this.letter = letter;
		this.prob = prob;
	}

	/**
	 * Gets the letter sorted in the class
	 * 
	 * @return the letter sorted in the class
	 */
	public char getLetter() {
		return letter;
	}

	/**
	 * Gets the letter's probability
	 * 
	 * @return the probability of the letter stored in the class
	 */
	public float getProb() {
		return prob;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/**
	 * Compares the Object containing a letter to another parameter object
	 * 
	 * @param o
	 *            the object to compare to <bold>this</bold>
	 * @return 0 if the objects are the same, -1 if <bold>this</bold> has a
	 *         higher probability (or letter in probability draw condition) and
	 *         1 if <bold>parameter</bold> has a higher probability (or letter
	 *         in a draw condition).
	 */
	@Override
	public int compareTo(LetterProbStruct o) {
		if (o.getClass() == this.getClass()) {
			if (this.getProb() > o.getProb()) {
				return -1;
			} else if (this.getProb() < o.getProb()) {
				return 1;
			} else if (this.getLetter() < o.getLetter()) {
				return -1;
			} else if (this.getLetter() > o.getLetter()) {
				return 1;
			}
		}
		return 0;
	}

}
