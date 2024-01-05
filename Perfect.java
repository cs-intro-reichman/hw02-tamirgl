/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);

		int divisorsSum = 1;
		String outputIfPerfect = number + " is a perfect number since " + number + " = 1";
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				divisorsSum += i;
				outputIfPerfect += " + " + i;
			}
		}

		if (number == divisorsSum && number != 1) {
			System.out.println(outputIfPerfect);
		}
		else {
			System.out.println(number + " is not a perfect number");
		}
		/* good use of string variable */
	}
}
