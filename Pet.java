public class Pet extends AbstractPet {
	protected String furColour;
	protected String breed;

	public Pet(String n, int a) {
		super(n,a);
	}
	public Pet(String n) {
		this(n,0);
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int n) {
		age=n;
	}
	public String toString() {
		String output = name + " is my pet and is aged " + age;
		return output;
	}
}