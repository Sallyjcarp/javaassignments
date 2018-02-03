package fifth.assignment;

public class PairOfDice {
	private final int max = 6;
	private int faceValue1, faceValue2;

	public PairOfDice() {
		faceValue1 = 1;
		faceValue2 = 1;	
	}

	public int rollDie1() {
		faceValue1 = (int) (Math.random() * max) + 1;
		return faceValue1;	
	}
	
	public int rollDie2() {
		faceValue2 = (int) (Math.random() * max) + 1;
		return faceValue2;	
	}
	

	public void setDie1FaceValue(int value) {
		if (value < 0 && value <= max)
			faceValue1 = value;
	}
	
	public void setDie2FaceValue(int value) {
		if (value < 0 && value <= max)
			faceValue2 = value;
	}

	public int getDie1FaceValue() {
		return faceValue1;
	}
	
	public int getDie2FaceValue() {
		return faceValue2;
	}
	
	public int sumOfDice() {
		PairOfDice dice = new PairOfDice();
		int val1 = dice.rollDie1();
		int val2 = dice.rollDie2();
		return val1+val2;	
	}

	public String toString(int fval) {
		String result = Integer.toString(fval);
		return result ;
	}

}
