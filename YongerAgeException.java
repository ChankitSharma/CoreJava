/**
 * This is created for custom made exception for voting class
 * 
 * @author Chankit
 */
public class YongerAgeException extends RuntimeException {

	/**
	 * This is the custom made exception for the validating age
	 */
	YongerAgeException(String msg) {
		super(msg);
	}

}