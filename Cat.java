/**
 * Subclass of Hierarchical_Inheritance
 * 
 * @author Chankit
 */
public class Cat extends Animal {

	/**
	 * This is the Cat class method
	 */
	void meow() {
		System.out.println("Meowing...");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		cat.run();
	}

}