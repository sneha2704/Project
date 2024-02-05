package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatementDemo {

	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("Connection is established");
	}
	
	public void insertRecord(int id, String name, String email, int age, String city) throws SQLException
	{
		preparedStatement = connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" Record is inserted");
	}
	
	public void searchByCity(String city) throws SQLException
	{
		preparedStatement = connection.prepareStatement("select * from person where city = ?");
		preparedStatement.setString(1, city);
		
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.println();
		}
	}
	
	public void updateRecord(String city, int id) throws SQLException
	{
		preparedStatement = connection.prepareStatement("update person set city = ? where pid = ?");
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2,  id);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record is updated");
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PreparedStatementDemo demo = new PreparedStatementDemo();
		
		Scanner sc = new Scanner(System.in);
		int age, id; String name, email, city;
		
		//demo.insertRecord(106, "Nurpur", "nurpur@gmail.com", 20, "Chennai");
		
		/*System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		city = sc.nextLine();
		System.out.println("Search by city : "+city);
		demo.searchByCity(city);*/
		
		System.out.println("Enter your choice.\n 1.insert new record\n 2.update record\n 3.search by city\n 4.delete by id");
		int choice = sc.nextInt();
		System.out.println("--------------------------------------------");
		switch(choice) 
		{
			case 1: demo.insertRecord(106, "Sneha", "sneha@gmail.com", 25, "Nagercoil");
				break;
			
			case 2: demo.updateRecord("Bangalore", 106);
				break;
				
			case 3: System.out.println("Enter city: ");
				//sc.next();
				city = sc.next();
				System.out.println("Search by city : "+city);
				demo.searchByCity(city);
				break;
			
			case 4: System.out.println("add delete record code");
				
				break;
				
			default:System.out.println("Invalid choice");
			
		}
		
		

	}

}
