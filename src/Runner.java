import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		/***
		 * Testing integer division -- truncates! Does NOT round off! % modulus returns
		 * the remainder of a division
		 */
		/*
		 * int numberBits = 10; int bite = 8; // spelled wrong to avoid a keyword
		 * conflict int nibble = 4; int byteAnswer = 0, byteRemainder = 0;
		 * 
		 * // test out 10 / 8 want 1 remainder 2 byteAnswer = numberBits / bite;
		 * byteRemainder = numberBits % bite;
		 * 
		 * System.out.println("bits = " + numberBits + " bytes = " + byteAnswer +
		 * " remainder = " + byteRemainder);
		 */

		/** How to handle mixed case y, Y, yes, Yes,YEs ... **/

		Scanner kbd = new Scanner(System.in);
		System.out.println("Hello, enter your answer (Y/N)");
		String answer = kbd.nextLine().toUpperCase();
		System.out.println("You have entered " + answer);

		// decision time!
		if (answer.equals("Y") || answer.equals("YES")) {
			System.out.println("You have selected YES!");

		} else if (answer.equals("N") || answer.equals("NO")) {
			System.out.println("You have selected NO!");

		} else {
			System.out.println("I am soooo confused! What do you want??? Please, pretty please try again!");
		}
	}

}