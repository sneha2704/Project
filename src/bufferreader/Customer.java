package bufferreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		double principleAmount, rate, year, total;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Id: ");
		Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Name: ");
		reader.readLine();
		
		System.out.println("Enter Principle Amount: ");
		principleAmount = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter Year: ");
		year = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter Rate: ");
		rate = Double.parseDouble(reader.readLine());
		
		total = (principleAmount * year * rate) / 100;
		System.out.println("Simple Interest: "+total);
		
		

	}

}
