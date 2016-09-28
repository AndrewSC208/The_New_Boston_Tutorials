// nestedIfStatements.java

public class nestedIfStatements{
	public static void main(String args[]) {

		int age = 60;

		if(age < 50) {
			System.out.prinln("you are young");
		} else {
			System.out.prinln("you are old");
			if(age > 75) {
				System.out.prinln("You are really old");
			} else {
				System.out.prinln("don't worry you are not really that old.");
			}
		}

	}
}