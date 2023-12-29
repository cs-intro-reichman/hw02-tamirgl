
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boyBorn = false;
		boolean girlBorn = false;
		int childrenCount = 0;
		String birthLog = "";

		while (!(boyBorn && girlBorn)) {
			childrenCount++;
			double randomNum = Math.random();

			if (randomNum < 0.5) {
				boyBorn = true;
				birthLog += "b ";
			}
			else {
				girlBorn = true;
				birthLog += "g ";
			}
		}

		System.out.println(birthLog);
		System.out.println("You made it... and you now have " + childrenCount + " children.");
	}
}
