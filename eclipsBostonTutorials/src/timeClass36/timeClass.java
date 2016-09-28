// timeClass.java
class timeClass {
	public static void main(String[] args) {
		secondClass secondClassObject = new secondClass();

		System.out.println(secondClassObject.toMilitary()); 
		secondClassObject.setTime(13, 25, 36);

		System.out.println(secondClassObject.toMilitary()); 
		
	}
}