package database_connection;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opencsv.CSVWriter;

public class Dump_Database_RecordsTo_Excel
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		//Example:-->using csv file dump all data to Excel
		
		
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		//Target database using driver manager
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost" + "databaseName=MQDSNR" + "user=sunil" + "password=111");
		
		//Execute Query..
		ResultSet result_set=con.createStatement().executeQuery("select * from studentlist");

		
		//Create New file writer
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\CSVfiles\\";
		FileWriter fw=new FileWriter(filepath+"DB_output.csv");
				
		//Create object for CsvFiles
		CSVWriter writer=new CSVWriter(fw);
		writer.writeAll(result_set, true);
	
		//Save and close
		writer.close();
	
		

	}

}
