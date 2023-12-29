/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String reversedStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		System.out.println(reversedStr);

		char middleCharOfStr = str.charAt((str.length() - 1) / 2);

		System.out.println("The middle character is " + middleCharOfStr);
	}
}
