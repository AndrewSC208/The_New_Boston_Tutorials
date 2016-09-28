public class buildingObjectsForConstrucrs {
	public static void main(String[] args) {
		// overloading constructors. 

		constructorsObject newXObject1 = new newXObject();
		constructorsObject newXObject2 = new newXObject(5);
		constructorsObject newXObject3 = new newXObject(5,13);
		constructorsObject newXObject4 = new newXObject(5,13,43);

		System.out.printf("%s\n", constructorsObject1.toMilitary());
		System.out.printf("%s\n", constructorsObject2.toMilitary());
		System.out.printf("%s\n", constructorsObject3.toMilitary());
		System.out.printf("%s\n", constructorsObject4.toMilitary());

	}
}

// a constructor is a method with the same name of the class.