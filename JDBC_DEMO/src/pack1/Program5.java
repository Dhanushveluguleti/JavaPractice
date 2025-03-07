package pack1;



	
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;

		public class Program5 {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				//load or register driver class
						Class.forName("com.mysql.cj.jdbc.Driver");
						//establish the connection
						Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/greatcorder_db","root", "root");
						//create statement
						Statement statement=connection.createStatement();
						//execute the query
						//statement.execute("INSERT INTO STUDENT VALUE(1,"Dhanush','Patna',8897509134)");
						//to update the data by using id
						statement.execute("UPDATE STUDENT SET LOC='B.N.Kandriga' WHERE IDSTUDENT=3");
						//close the connection
						connection.close();
						System.out.println("Data has been UPDATED");

			}

		}





