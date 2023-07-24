/**
 * This is the constructor class for performing Defalult and Parameterized constructor
 * 
 * @author Chankit
 */
public class Constructor {

	int multiplication;

	/**
	 * Creating default constructor and Print the message.
	 */
	Constructor() {
		System.out.println("This is a Default Constructor");
	}

	/**
	 * Creating Parameterized constructor and performing multiplication between two numbers.
	 */
	Constructor(int number1, int number2) {
		multiplication = number1 * number2;
		System.out.println("Multiplication of Two Numbers- " + " " + multiplication);
	}

	public static void main(String[] args) {
		new Constructor();
		new Constructor(10, 20);
	}

}