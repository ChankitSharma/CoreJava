import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Creating a read and write class for access files in system
 * 
 * @author Chankit
 */
public class ReadAndWrite {

	/**
	 * This is the readFile method for access the main file and used throws keyword for the checked exception
	 * 
	 * @exception FileNotFoundException
	 */
	public static void readFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("E:\\tomacate.txt");
	}

}