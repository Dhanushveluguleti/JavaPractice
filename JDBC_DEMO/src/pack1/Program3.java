package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		            //1.load or register driver class
					Class.forName("com.mysql.cj.jdbc.Driver");
					//2.establish the connection
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/greatcorder_db","root", "root");
	                //3.create statement
		            Statement statement=connection.createStatement();
		            //4.execute the query
					ResultSet resultset=statement.executeQuery("SELECT * FROM STUDENT");
					while(resultset.next())
					{
						System.out.println(resultset.getInt(1));
						System.out.println(resultset.getString(2));
						System.out.println(resultset.getString(3));
						System.out.println(resultset.getLong(4));
						System.out.println("**********************");
					}
					//5.close the connection
					connection.close();
					System.out.println("Data has been fetched");

	}

}
