class variableLengthArguments35 {
	public static void main(String[] args) {
		// this is the body of the main method:
		System.out.println(average(89,32423,2342,3,3234));
	}

	// this is a method that will take as many arguments as we need:
	public static int average(int...numbers) {
		// the elips is for passing as many numbers as needed in the method. 
		int total = 0;
		for(int x: numbers){
			total += x;
		}
		return total/numbers.length;
	}
}