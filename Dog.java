public class Dog extends Pet {
	protected String favouriteToy;
	public Dog(String n, int a) {
		super(n,a);
	}
	public Dog(String n, int a, String f) {
		super(n,a);
		favouriteToy = f;
	}
	public String toString() {
		String output = name + " is my dog, aged " + age;
		return output;
	}
	public String toString(String s) {
		String output = name + " is a dog, aged " + age + " and likes to play with " + favouriteToy + " " + s;
		return output;
	}
	public void giveTreat() {
		System.out.println(name + " says thanks for the treat!");
	}
}