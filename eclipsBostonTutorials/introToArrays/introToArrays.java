package tutorials;

public class introToArrays {

	public static void main(String[] args) {
		// this is the intro to arrays:
		// an array is a var that can store many variables in it. 
			// can only store the same data type.
		
		// create an array names andrewArray with 10 values:
		int andrewArray[] = new int[10];
		
		
		// initalizing the array variable elements:
		andrewArray[0] = 87;
		andrewArray[1] = 56;
		andrewArray[2] = 87;
		andrewArray[3] = 56;
		andrewArray[4] = 87;
		andrewArray[5] = 56;
		andrewArray[6] = 87;
		andrewArray[7] = 56;
		andrewArray[9] = 87;
		andrewArray[9] = 56;
		
		// this shows the firt array that I made:
		System.out.println(andrewArray[2]);
				
	
		// or we can create and array initalizer this is a more effective way to use the array:
		int anotherArray[] = {1, 23, 23, 34, 54, 32, 7676, 234, 563, 876};
		System.out.println(anotherArray[6]);
		
	}

}
