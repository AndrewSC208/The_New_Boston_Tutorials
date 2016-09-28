//mainClass.java

class mainClass {
	public static void main(String args[]) {

		// we need to create an object that uses the other class:
		// we have to crate that object of the other class before we can use the method of that class.
		secondaryClass secondaryClassObject = new secondaryClass();
		// after it is created we use it. 
		secondaryClassObject.simpleMessage();
		// this is a reference to the second method that is in the object.
		secondaryClassObject.secondSimpleMessage();
		
	}
}

// this is a farly simple task of creating new classes and then objects from them and then a method that is inside of the object.