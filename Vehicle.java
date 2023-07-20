/**
 * This program is demonstrate to Abstraction
 * 
 * @author Chankit
 */
public abstract class Vehicle {

	int tyre;

	/**
	 * This is the Non abstract method
	 */
	void showTyre(int value) {
		tyre = value;
	}

	/**
	 * This is Abstract method
	 */
	abstract void start();

}