/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);

		System.out.println(1);
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(x);
	}
}
