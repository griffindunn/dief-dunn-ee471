/**
 * 
 */

/**
 * @author prd005
 *
 */
public class LetterProbStruct implements Comparable<LetterProbStruct>{

	private char letter;
	private float prob;

	public LetterProbStruct(char letter, float prob){
		this.letter = letter;
		this.prob = prob;
	}

	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public float getProb() {
		return prob;
	}
	public void setProb(float prob) {
		this.prob = prob;
	}

	@Override
	public int compareTo(LetterProbStruct o) {
		if(o.getClass() == this.getClass()){
			if (this.getProb() > o.getProb()){
				return -1;
			} else if (this.getProb() < o.getProb()){
				return 1;
			} else if (this.getLetter() < o.getLetter()){
				return -1;
			} else if (this.getLetter() > o.getLetter()){
				return 1;
			}
		}
		return 0;
	}

}
