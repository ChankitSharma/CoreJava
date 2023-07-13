/**
 * This class is extending Vehicle class for achiving Abstraction.
 */
public class Car extends Vehicle {

	void start() {
		/**
		 * This is the implementation of Abstract method 
		 */
		System.out.println("Car Start with key");
		System.out.println("Number of tyre's Car have" + tyre);
	}

	/**
	 *  Main method of that class 
	 */
	public static void main(String[] args) {

		Vehicle vehicle = new Car();
		/**
		 * Calling perent class method
		 */
		vehicle.showTyre(4);
		vehicle.start();
	}

}