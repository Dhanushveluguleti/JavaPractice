package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Program4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load or register driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection connection=DriverManager.getConnection("jdbc:mysql:localhost:3306/dhanush_db", "root","root");
		//create statement
		Statement statement=connection.createStatement();
		//execute the query
		statement.execute("INSERT INTO CLASS VALUE(20,'GOLD','2NDFLORE',8897509134)");
		//close the connection
		connection.close();
		System.out.println("data has been inserted");
		
		

	}

}
