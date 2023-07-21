/**
 * Dogs class is extending Animal class.
 * 
 * @author Chankit
 */
public class Dogs extends Animals {

	/**
	 * This is the the method for barking
	 */
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