package tutorials2;

public class arraysInMethods {

	public static void main(String[] args) {
		int andrew[] = {3, 5, 6, 3, 45,56};
		
		System.out.println("this is the original array: ");
		
		for(int x:andrew) {
			System.out.println(x);
		}
		
		// method call:
		change(andrew);
		
		
		for(int y:andrew) {
			System.out.println(y);
		}
		
	}
	
	// methods:
	public static void change(int x[]){
		for(int c = 0;c < x.length; c++ ) {
			x[c]+= 5;
		}
		System.out.println(" ");
		System.out.println("We have added 5 to every number in the array: ");
	}

}
