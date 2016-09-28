package tutorials;

public class summingArrayElements {

	public static void main(String[] args) {
		// lets sum some array elements:
		int andrew[] = {34, 32, 56, 57, 341, 56, 342, 56};
		int sum = 0;
		
		// for loop to sum the array
		for(int i = 0; i < andrew.length; i++) {
			sum += andrew[i];
		}
		
		System.out.println("The sume of the array is " + sum);
	}

}
