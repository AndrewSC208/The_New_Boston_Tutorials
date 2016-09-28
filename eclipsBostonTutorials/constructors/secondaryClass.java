//secondaryClass.java

public class secondaryClass {
	private String girlName;

	// constructor:
	public secondaryClass(String name) {
		girlName = name;
	}

	// set name method:
	public void setName(String name) {
		girlName = name;
	}
	// get method:
	public String getName() {
		return girlName;
	}
	// user method:
	public void saying() {
		System.out.printf("your first gf was %s\n ", getName());
	}
}