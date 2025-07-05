public class Cat extends Pet {
	protected String favouriteSpot;
	public Cat(String n, int a) {
		super(n,a);
	}
	public Cat(String n, int a, String f) {
		super(n,a);
		favouriteSpot = f;
	}
	public String toString() {
		String output = name + " is a cat, aged " + age;
		return output;
	}
	public String toString(String  s) {
		String output = name + " is a cat, aged " + age + " and likes to sit on " + favouriteSpot + " " + s;
		return output;
	}
}