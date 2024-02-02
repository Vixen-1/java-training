package effigo.ayushi.training.filesystem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReaderWriter {
	public static void main(String[] args) {
		
		File file = new File("input.txt");
		Scanner scan = new Scanner(System.in);
		
		try {
			boolean bool = file.createNewFile();
			if(bool)
			{
				System.out.println("New fle created");
			}
			else {
				System.out.println("File could not be created. It already exists!");
			}
			System.out.println("Enter the string you want to add to the file: ");
			String str = scan.nextLine();
			try(FileWriter fileWriter = new FileWriter(file) ){
				fileWriter.write(str);
				fileWriter.close();
			}
			System.out.println("Data is written to the file.");
			System.out.println();
			
			System.out.println("Lets display whats inside the file.");
			char[] string = new char[100];
			try (FileReader fileReader = new FileReader(file)) {
					fileReader.read(string);
				}
			System.out.println(string);
				
			boolean res = file.delete();
			if(res) {
				System.out.println("File is deleted");
			}
			else {
				System.out.println("File is not deleted");
			}
		}
		catch(Exception e) {
				e.printStackTrace();
			}
			
		finally {
			System.out.println("We are done.");
		}
		scan.close();
	}
}
