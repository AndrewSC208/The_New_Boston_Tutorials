// manyMethodsAndInstances.java
import java.util.Scanner;
public class manyMethodsAndInstances {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		secondaryClass secondaryClassObject = new secondaryClass();

		System.out.println("Enter the name of first gf here: ");
		String temp = input.nextLine();
		secondaryClassObject.setName(temp);
		secondaryClassObject.saying();
				
	}
} 
