public class Car extends Vehicle {

	void start() {
		/*
		 This is the implementation of Abstract method
		 */
		System.out.println("Car Start with key");
		System.out.println("Number of tyre's Car have" + tyre);
	}
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		vehicle.showTyre(4);
		vehicle.start();
	}
	
}