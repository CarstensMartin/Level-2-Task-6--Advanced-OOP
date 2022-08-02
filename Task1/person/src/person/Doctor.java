package person;

public class Doctor extends Person {
	// Declare attributes specific to Doctor
	int yearsExperience;
	String ranking;

	// Method to determine the rank of the doctor
	public String RankingDoctor(int experienceYears) {
		if (experienceYears >= 21) {
			ranking = "Attending";
		} else if (experienceYears >= 17) {
			ranking = "Fellow";
		} else if (experienceYears >= 9) {
			ranking = "Resident";
		} else if (experienceYears >= 7) {
			ranking = "Intern";
		} else {
			ranking = "Medical Student";
		}
		return ranking;
	}

	void AttributesDoctor() {
		// Action method to determine the rank of the doctor based on years of
		// experience
		ranking = RankingDoctor(yearsExperience);
		// Display information of the Doctor by referring to Base class & Sub Class
		System.out.println("\nHeight of the Doctor: " + height);
		System.out.println("Hair color of the Doctor: " + hairColor);
		System.out.println("Over 18 years of age the Doctor: " + over18Years);
		System.out.println("The years of experience of the Doctor is: " + yearsExperience);
		System.out.println("The ranking of the Doctor is: " + ranking);
	}
}