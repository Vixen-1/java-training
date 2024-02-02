package effigo.ayushi.training.filesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedExampple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File file = new File("Bufferedfile.txt");
		boolean create;
		try {
			create = file.createNewFile();
			if(create) {
				System.out.println("File is created.");
			}
			else {
				System.out.println("File already exist.");
			}
			
			System.out.println("\nEnter a message you want to add: \n");
			String msg = scan.nextLine();
			try(FileWriter fileWriter = new FileWriter(file)) {
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
				bufferWriter.write(msg);
				bufferWriter.close();
			}
			System.out.println("Data is written to the file.");
			System.out.println();
			
			char[] txt = new char[100];
			try(FileReader fileReader = new FileReader(file)) {
				BufferedReader bufferReader = new BufferedReader(fileReader);
				bufferReader.read(txt);
				bufferReader.close();
			}
			System.out.println(txt);
			boolean end = file.delete();
			if(end) {
				System.out.println("Deleted successfully!");
			}
			else {
				System.out.println("Cannot delete!");
			}
			scan.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
