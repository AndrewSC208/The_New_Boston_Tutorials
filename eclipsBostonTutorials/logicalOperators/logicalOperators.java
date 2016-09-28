// logicalOperators

class logicalOperators {
	public static void main(String args[]) {

		int boy, girl;
		boy = 9;
		girl = 40;

		if(boy > 10 && girl < 60) {
			// both of the test statements have to be true or this will not execute. 
			System.out.println("You can enter");

		} else {
			System.out.println("You can not enter.");
		}

		if(boy > 10 || girl < 60) {
			 
			System.out.println("You can enter");

		} else {
			System.out.println("You can not enter.");
		}


	}
}

// Notes:
	/*

		// &&: the logical and. For this to return true anything on either side of this has to be true, or it will return false.
		
		// ||: the logical or. For this to return true one or the other has to be true. 
		
	*/