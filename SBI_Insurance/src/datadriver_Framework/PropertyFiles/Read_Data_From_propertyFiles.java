package datadriver_Framework.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_propertyFiles
{

	public static void main(String[] args) throws IOException 
	{
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\PropertyFiles\\";
		//Target file location
		FileInputStream fi=new FileInputStream(filepath+"Input.properties");
		
		//Create object for property files
		Properties repository=new Properties();
		//load all input properties to repository
		repository.load(fi);
		
		
		//Get any value from repository using keyname
		String Appurl=repository.getProperty("url");
		System.out.println("Application url is => "+Appurl);
		
		//Get value from repository using keyname
		String firstname=repository.getProperty("firstname.input");
		System.out.println("Firstname input value is => "+firstname);
		
		
		//Get value from repository
		String Email=repository.getProperty("useremail");
		//Using String Class methods split available string
		String arr[]=Email.split(",");
		System.out.println("zero index value is => "+arr[0]);
		System.out.println("first index value is => "+arr[1]);
		
		
		
		
		
		
		
		
		
		
	}

}
