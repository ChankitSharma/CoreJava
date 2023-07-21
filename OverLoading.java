/**
 * In this program we are performing compile time Polymorphism.
 * 
 * @author Chankit
 */
public class OverLoading {

	/**
	 * This add method is performing to add two numbers
	 */
	void add(int numberOne, int numberTwo) {
		int number = numberOne + numberTwo;
		System.out.println("Addition of Integer Number : " + number);
	}

	/**
	 * This add method is perfroming to add two interger along with deciaml numbers
	 */
	void add(int integerNumber, Double decimalNumber) {
		int numberX = integerNumber;
		double numberY = decimalNumber;
		double sum = numberX + numberY;
		System.out.println("Addition of Interger and Decimal Number : " + sum);
	}

	public static void main(String[] args) {
		OverLoading overloading = new OverLoading();
		overloading.add(10, 20);
		overloading.add(30, 22.55);
	}

}