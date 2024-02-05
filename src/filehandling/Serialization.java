package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(101, "Sneha", "Programmer");
		
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/snehamicky/Downloads/ser.txt"));
		
		FileOutputStream outputStream = new FileOutputStream("/Users/snehamicky/Downloads/ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("converted emp obj into byte stream");

	}

}
