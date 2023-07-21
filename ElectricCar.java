/**
 * Subclass inheriting from Car for achieving Multi-level Inheritance
 * 
 * @author Chankit
 */
public class ElectricCar extends Car {

	/**
	 * This is charge method for Charging the Electric Car
	 */
	void charge() {
		System.out.println("The Electric Car is charged.");
	}

	/**
	 * Main method is to demonstrating multilevel inheritance
	 */
	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.start();
		electricCar.accelerate();
		electricCar.charge();
		System.out.println("Program of Multi-Level Inheritance");
	}

}