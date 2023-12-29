/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int totalSumOfChildren = 0;
		int count2Children = 0;
		int count3Children = 0;
		int count4OrMoreChildren = 0;
		int mode;

		for (int t = 0; t < T; t++) {
			int childrenCount = 0;
			boolean boyBorn = false;
			boolean girlBorn = false;

			while (!(boyBorn && girlBorn)) {
				childrenCount++;
				double randomNum = Math.random();

				if (randomNum < 0.5) {
					boyBorn = true;
				}
				else {
					girlBorn = true;
				}
			}

			totalSumOfChildren += childrenCount;
			
			if (childrenCount == 2) {
				count2Children++;
			}
			else if (childrenCount == 3) {
				count3Children++;
			}
			else {
				count4OrMoreChildren++;
			}
		}

		double averageChildren = (double) totalSumOfChildren / T;

		if (Math.max(Math.max(count2Children, count3Children), count4OrMoreChildren) == count2Children) {
			mode = 2;
		}
		else if (Math.max(count3Children, count4OrMoreChildren) == count3Children) {
			mode = 3;
		}
		else {
			mode = 4;
		}

		System.out.println("Average: " + averageChildren +  " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2Children);
		System.out.println("Number of families with 3 children: " + count3Children);
		System.out.println("Number of families with 4 or more children: " + count4OrMoreChildren);
		System.out.println("The most common number of children is " + mode + ".");
	}
}
