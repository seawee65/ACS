public class Person {

	private String name;
	private int yearOfBirth;

	public Person (String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName () { return name; }
	public int getYearOfBirth () { return yearOfBirth; }

	public String toString () { return String.format ("Hi! My name is %s, and I was born in %s.", name, yearOfBirth); }

}
