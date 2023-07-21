import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * The ReadTextFile class demonstrates how to Read a text file.
 * 
 * @author Chankit
 */
public class ReadTextFile {

	public static void main(String[] args) {
		File file = new File("E:\\myTextFile.txt");
		try {
			FileReader fileReader = new FileReader(file);
			int character;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);
			}
			fileReader.close();
		} catch (IOException ioException) {
			System.out.println("An error occurred while Reading the file: ");
			ioException.printStackTrace();
		}
	}

}