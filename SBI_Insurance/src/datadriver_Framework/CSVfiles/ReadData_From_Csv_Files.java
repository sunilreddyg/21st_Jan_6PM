package datadriver_Framework.CSVfiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadData_From_Csv_Files {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\CSVfiles\\";
		//Target file location
		FileReader fr=new FileReader(filepath+"Inputdata.csv");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Read header
		reader.readNext();
		
		//Target first line at csv file
		String line1[]=reader.readNext();
		System.out.println("=>"+line1[0]+"   =>"+line1[1]);
		

		//Read all Records
		String Rline[];
		while((Rline=reader.readNext()) != null)
		{
			System.out.println(Rline[0]+"   "+Rline[1]);
		}
		
		

	}

}
