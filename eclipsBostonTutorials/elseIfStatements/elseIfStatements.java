public elseIfStatements {
	public static void main(String [] args) {
		int age = 45;

		if(age >= 60) {
			System.out.println("you are over 60");
		} else if (age >= 50) {
			System.out.println("you are in your 50's");
		} else if (age >= 45) {
			System.out.println("you are in your 40's");
		} else {
			System.out.println("you are a young person");
		}
	}
}