public class PetTest {
	public static void main(String[] args) {
		Pet a = new Pet("Flossy");
		System.out.println(a.toString());

		Pet[] e = new Pet[3];
		e[0] = new Pet("Tilly",2);
		e[1] = new Cat("Spotty",1);
		e[2] = new Dog("Bull",4);

		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].toString());
		}

		// e[2].provideTreat(); 	// DOES NOT WORK
		// ((Dog)e[2]).provideTreat(); // casting - risky
	}
}