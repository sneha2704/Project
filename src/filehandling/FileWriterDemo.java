package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter writer = new FileWriter("/Users/snehamicky/Downloads/xyz.txt", true);
		writer.write("\nWe are learning file handling");
		writer.close();
		System.out.println("File created");

	}

}
