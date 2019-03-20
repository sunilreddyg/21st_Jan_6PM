package datadriver_Framework.PropertyFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiles
{

	public static void main(String[] args) throws IOException, IOException 
	{
		
		//Create object for Property files
		Properties repository=new Properties();
		
		repository.setProperty("Result1", "Tc001 Pass");
		repository.setProperty("Result2", "Tc002 Pass");
		repository.setProperty("Result3", "Tc003 Pass");
		repository.setProperty("Result4", "Tc004 Pass");
		
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\PropertyFiles\\";
		repository.store(new FileOutputStream(filepath+"Ouput.properties"), "login testData");
		

	}

}
