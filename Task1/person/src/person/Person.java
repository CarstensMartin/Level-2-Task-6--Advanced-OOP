package person;

//Class Person created - Base Class
public class Person {
	// Declare all the attributes of Base Class
	int height;
	String hairColor;
	boolean over18Years;

	// If this void is called the below information will display
	void attributesPerson() {
		System.out.println("Height: " + height);
		System.out.println("HairColor: " + hairColor);
		System.out.println("Over18Years: " + over18Years);
	}
}