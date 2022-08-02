package person;

public class AttributeValues {

	public static void main(String[] args) {
		// Create a new object - Scientist
		Scientist scientistPerson = new Scientist();
		// Attribute values of the Scientist
		scientistPerson.height = 182;
		scientistPerson.hairColor = "Brown";
		scientistPerson.over18Years = false;
		scientistPerson.labCoatColour = "Red";
		// Display / Print out description of Scientist
		scientistPerson.AttributesScientist();

		// Create a new object - Doctor
		Doctor doctorPerson = new Doctor();
		// Attribute values of the Doctor
		doctorPerson.height = 152;
		doctorPerson.hairColor = "Black";
		doctorPerson.over18Years = true;
		doctorPerson.yearsExperience = 10;
		// Display / Print out description of Doctor
		doctorPerson.AttributesDoctor();
	}
}