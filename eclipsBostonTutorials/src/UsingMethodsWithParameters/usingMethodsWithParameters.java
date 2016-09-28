// usingMethodsAndInstatnces.java

// scanner:
import java.util.Scanner;

// create usingMethodsAndInstance class
class usingMethodsWithParameters {

	// create the main class that starts the program
	public static void main(String[] args) {
		// create the scanner object so that we can get the name:
		Scanner input = new Scanner(System.in);

		// create the secondaryClass object so that we can use the other class we made.
		secondaryClass secondaryClassObject = new secondaryClass();

		// Output a line to get the name
		System.out.println("Enter your name here: ");
		String yourName = input.nextLine();

		System.out.println("Enter the name of your wife: ");
		String wifeName = input.nextLine();

		secondaryClassObject.simpleMessage(yourName);
		secondaryClassObject.simpleMessage(wifeName);

		secondaryClassObject.secondMeassage(yourName, wifeName);
	}
}

// This is all vary straight forward. I know most of this already it is just a good refresher.
