public abstract class AbstractPet {
	protected String name;
	protected int age;
	public AbstractPet(String n, int a) {
		name = n;
		age = a;
	}
	public String toString() {
		return name + " is aged " + age;
	}
}