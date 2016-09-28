package tutorials;

public class arrayTables {

	public static void main(String[] args) {
		// this is an intro to array tables
		System.out.println("Intex\tValue");
		
		// array intitalizer:
		int andrew[] = {45234, 364567, 56735, 553, 567};
		
		// use a for loop to print out our array and the index:
		for(int i = 0; i < andrew.length; i++) {
			System.out.println(i + "\t" + andrew[i]);
		}
	}

}


// t\ = a tab.