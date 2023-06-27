/**
 * Dogs class is extending Animal class.
 */
public class Dogs extends Animals {

	void bark() {
		System.out.println("Barking...");
	}
	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.eat();
		dog.bark();
		dog.run();
	}
}
