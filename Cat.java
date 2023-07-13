/**
 * Subclass of Hierarchical_Inheritance
 */
public class Cat extends Animal{

	/**
	 * This is the Cat class method
	 */
	void meow() {
		System.out.println("Meowing...");
	}
	/**
	 * Main method of that class
	 */
	public static void main(String[] args) {
		Cat cat=new Cat();  
		cat.meow();  
		cat.eat(); 
		cat.run();
	}
	
}