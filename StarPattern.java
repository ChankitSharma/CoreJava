/**
 * This class is performing star patterns
 * 
 * @author Chankit
 */
public class StarPattern {

	public static void main(String[] args) {
		// Outer loop to control the number of rows
		for (int i = 1; i <= 5; i++) {
			// Inner loop to print the stars in each row
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			// Move to the next line after printing stars in a row
			System.out.println();
		}
	}

}