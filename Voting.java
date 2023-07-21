import java.util.Scanner;

/**
 * This class is created for validation for voting.
 * 
 * @author Chankit
 */
public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		try {
			int age = scan.nextInt();

			if (age < 18) {
				throw new YongerAgeException("Invalide age");
			} else {
				System.out.println("Eligible for vote");
			}
		} catch (YongerAgeException yongerAgeException) {
			System.out.println("Exception Occourred: ");
			yongerAgeException.printStackTarce();
		} finally {
			scan.close();
		}
	}

}