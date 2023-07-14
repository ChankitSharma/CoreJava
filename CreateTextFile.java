import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The CreateTextFile class demonstrates how to create a text file and add personal details to it.
 */
public class CreateTextFile {

	public static void main(String[] args) {
		/**
		 * Creating a file object and configure path and file name which we want to create.
		 */
		File file = new File("E:\\myTextFile.txt");
		
		try {
			/**
			 * It will give  IOException for that reson we are puting code inside try catch block
			 */
			if(file.createNewFile()) {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Name: Mike Tyson" +"\n" +" Age: 30"+"\n"+"Post: Software Engineer");
				fileWriter.close();
				System.out.println("File created successfully.");
			}
			else {
				 System.out.println("File is Already Exist...");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file: " + e.getMessage());
		}
	}
	
}
