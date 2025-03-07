package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		  
			// TODO Auto-generated method stub
			//load or register driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					//establish the connection
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/greatcorder_db","root", "root");
					//create statement
					Statement statement=connection.createStatement();
					//execute the query
					statement.execute("DELETE  FROM STUDENT  WHERE IDSTUDENT=4");
					//close the connection
					connection.close();
					System.out.println("Data has been DELETED");

		}
		


	}


