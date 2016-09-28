
public class tableForMultiArrays34 {

	public static void main(String[] args) {
		// 
		// int firstArray[row][column]
		int firstarray[][] = /* row 1 */{{ 8, 9, 0, 34, 5},
				 			 /* row 2 */ {45, 4, 5, 65, 3}}; 
		// this is a multi dimensional array:		 			  
		int secondarray[][] = {{30, 31, 32, 33},
							   {43},
							   { 4,  5,  5,  6}};

		//method call:
		System.out.println("This is the first array");
		display(firstarray);

		System.out.println("This is the second array");
		display(secondarray);


		} // end of the main class:

		public static void display(int x[][]) {
			// loop through the rows:
			for(int row = 0; row < x.length; row++) {
				// loop through the columns:
				for(int columns = 0; columns < x[row].length; columns++) {
					System.out.print(x[row][columns] + " \t");
				}// end of inside loop
				System.out.println();
			} // end of outside loop
		}

	} // end of class tableForMultiArrays34


