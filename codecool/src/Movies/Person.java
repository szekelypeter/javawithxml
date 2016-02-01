package Movies;

public class Person {

	String firstName = "";
	String lastName = "";
	Gender gender = null;
	boolean hasOscar = false;
	boolean hasGoldenGlobe = false;

	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGenre() {
		return gender;
	}

	public void setGenre(Gender genre) {
		this.gender = genre;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString() {
		return "<person>" + "<firstName>" + firstName + "</firstName>" + "<lastName>" + lastName + "</lastName>"
				+ "<gender>" + gender + "</gender>" + "<hasOscar>" + hasOscar + "</hasOscar>" + "<hasGoldenGlobe>"
				+ hasGoldenGlobe + "</hasGoldenGlobe>" + "</person>";
	}
}

