package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_Connection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		//Target database using driver manager
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost" + 
		"databaseName=MQDSNR" + "user=sunil" + "password=111");
		
		ResultSet result_set=con.createStatement().executeQuery("select * "
				+ "from studentlist");

		//Read All Records under result
		while(result_set.next())
		{
			 String Student_Name=result_set.getString("Name");
			 String Student_mobile=result_set.getString("MobileNumber");
			 String Student_Email=result_set.getString("Email");
			 
			
		}
		
		
	}

}
