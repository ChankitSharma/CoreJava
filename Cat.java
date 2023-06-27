/**
 * Subclass of Hierarchical_Inheritance
 */
public class Cat extends Animal{

	void meow() {
		System.out.println("Meowing...");
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();  
		cat.meow();  
		cat.eat(); 
		cat.run();
	}
	
}