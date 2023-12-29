/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomInt = (int) (Math.random() * 10);
		int lastValue;
		do {
			System.out.println(randomInt);
			lastValue = randomInt;
			randomInt = (int) (Math.random() * 10);
		} while (randomInt >= lastValue);
	}
}
