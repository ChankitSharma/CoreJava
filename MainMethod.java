/**
 * This is the main method for the accessing main files in our system. 
 */
import java.io.FileNotFoundException;

public class MainMethod {

	public static void main(String[] args) {
		try {
			ReadAndWrite.readFile();
			System.out.println("File is found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("Rest of the code...");
	}
}