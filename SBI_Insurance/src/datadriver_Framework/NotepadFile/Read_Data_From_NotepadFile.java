package datadriver_Framework.NotepadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Data_From_NotepadFile 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\NotepadFile\\";
		//Create object for scanner
		Scanner sc=new Scanner(new File(filepath+"Inputdata.txt"));
		
		//Read header
		sc.nextLine();
		
		
		//using conditional loop read data
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			//Split line using delimeter
			String arr[]=line.split(",");
			System.out.println(arr[0]+"   "+arr[1]);
		}
		
		
		
	}

}
