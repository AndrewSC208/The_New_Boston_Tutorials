// this is the increment variable section:

import java.util.Scanner;

class Increment {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		int tuna = 5;
		int bass = 18;

		++tuna; // this changes tuna to 6

		System.out.println(tuna++); // this will display six and then change tuna to 7.
		System.out.println(tuna);

		// tuna = tuna + 5; can be written like this.
		tuna += 5;

		System.out.println(tuna);

	}
}



// Notes: 

// Increment: Allows you to add one to a variable with ++ or subtract a variable with a --

	// pre-incrementing: this is when the ++ or -- is placed before the variable.
	// post-increment: this is when the ++ or -- is placed after the variable. One thing to note
		// is if you are using the variable then incrementing it then  