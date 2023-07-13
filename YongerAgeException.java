/**
 * This is created for custom made exception for voting class
 */
public class YongerAgeException extends RuntimeException{

	/**
	 * This is custom made exception for validating age
	 */
	YongerAgeException(String msg) {
		super(msg);
	}
}
