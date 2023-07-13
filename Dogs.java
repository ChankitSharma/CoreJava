/**
 * Dogs class is extending Animal class.
 */
public class Dogs extends Animals {

	/**
	 * This is the the method for barking
	 */
	void bark() {
		System.out.println("Barking...");
	}
	/**
	 * Main method of that class
	 */
	public static void main(String[] args) {
		Dogs dog = new Dogs();
		/**
		 * Calling eat method from Animal class
		 */
		dog.eat();
		/**
		 * Calling bark method from Dogs class
		 */
		dog.bark();
		/**
		 * Calling eat method from Animal class
		 */
		dog.run();
	}
}
