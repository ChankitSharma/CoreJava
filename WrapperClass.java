import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *Comparing two variables using wrapper class Data type.
 */
public class WrapperClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		
		Integer numberOne;
		try
		{
            numberOne = scanner.nextInt();
        } 
		catch (InputMismatchException e) {
            System.out.println("Invalid input for the first Number");
            scanner.close();
            return;
        }
		
		System.out.println("Enter the scond Number : ");
		Integer numberTwo ;
		try
		{
            numberTwo = scanner.nextInt();
        }
		catch (InputMismatchException e) {
            System.out.println("Invalid input for the scond Number");
            scanner.close();
            return;
        }

		if (numberOne != null && numberTwo != null)
		{
			if (numberOne > numberTwo) 
			{
				System.out.println("First Number is greater then Second Number");
			} else if (number1 < number2) {
				System.out.println("First Number is Smaller then Second Number");
			} else
			{
				System.out.println("Number is Equal");
			}
		}
		 scanner.close();
	}
	
}