// secondaryClass.java

public class secondaryClass {
	// only the methods inside this class can use private variables
	private String girlName;
	// setName method:
	public void setName(String name) {
		girlName = name;
	}
	// getName method:
	public String getName() {
		return girlName;
	}
	// user method:
	public void saying() {
		System.out.printf("your first girl friend %s ", getName());
	}

}