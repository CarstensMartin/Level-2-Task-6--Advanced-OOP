package person;

class Scientist extends Person {
	// Declare attributes specific to Scientist
	String labCoatColour;
	String typeScientist;

	// Method to determine kind of scientist
	public String ScientistTypeMethod(String theLabCoatColour) {
		if (theLabCoatColour.equals("Green")) {
			typeScientist = "Biologist";
		} else if (theLabCoatColour.equals("Purple")) {
			typeScientist = "Physicist";
		} else if (theLabCoatColour.equals("White")) {
			typeScientist = "Pharmacist";
		} else if (theLabCoatColour.equals("Blue")) {
			typeScientist = "Climatologist";
		} else if (theLabCoatColour.equals("Yellow")) {
			typeScientist = "Geneticist";
		} else if (theLabCoatColour.equals("Red")) {
			typeScientist = "Zoologist";
		} else {
			typeScientist = "Coat colour not recognised";
		}
		return typeScientist;
	}

	void AttributesScientist() {
		// Action method to determine typeScientist based on coat color
		typeScientist = ScientistTypeMethod(labCoatColour);
		// Display information of the scientist by referring to Base class & Sub Class
		System.out.println("\nHeight of the Scientist: " + height);
		System.out.println("Hair color of the Scientist: " + hairColor);
		System.out.println("Over 18 years of age the Scientist: " + over18Years);
		System.out.println("Lab coat colour of the Scientist: " + labCoatColour);
		System.out.println("The type of Scientist: " + typeScientist);
	}
}