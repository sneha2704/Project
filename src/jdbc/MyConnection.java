package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	static Connection connection;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException 
	{
		if(connection == null)
		{
			//register driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish Connection
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha", "root", "password");
			
			return connection;
		}
		
		else
		{
			return connection;
		}
	}
	

}
