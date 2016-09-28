// practice if statements:
public class ifStatement {
	public static void main(String[] args)
	{
		// lets make and if statement:
		int x = 10;
		int y = 23;


		// these are two if statements:
		if(x > y) // << this is the test
		{
			// body of the if statement:
			System.out.println("x is greater then y");
		}
		
		// this is a separate if statement. 
		if(x < y ) // << this is the test
		{
			System.out.println("y is greater then x");
		}

		// this is an if/else statement. 
		if(x > y) // << this is the test
		{
			System.out.println("x is greater then y");
		} else // << this will run if the test statement is false.
		{
			System.out.println("This means that x is not greater then y and so this code was executed");
			System.out.println("This is pretty simple stuff");
		}
	}
}

// test operators: 
	// >= 
	// <= 
	// !=
	// ==
	// ===