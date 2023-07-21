/**
 * Created this class for performing Try catch block
 * 
 * @author Chankit
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int number1 = 9, number2 = 0, result;
			result = number1 / number2;
			System.out.println(result);
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Exception Occurred: ");
			arithmeticException.printStackTrace();
		} finally {
			System.out.println("This is finally block...");
		}
	}

}