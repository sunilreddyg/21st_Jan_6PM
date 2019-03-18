package datadriver_Framework;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Junit_Read_MultipleRow_Using_Conditions
{
	static String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\";
	static String sheetname="Sheet4";
	static String filename="InputData.xlsx";
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static WebDriver driver;
	
	
	@Test
	public void Tc001_ReadData_From_DynamicRows()
	{
		
		//Get Number of row data available
		int Row_count=sht.getLastRowNum();
		System.out.println("Number of Rows Data available is => "+Row_count);
		
		//Iterate for Number of rows
		for (int i = 5; i <= Row_count; i++) 
		{
			//Target Dynamic Row
			row=sht.getRow(i); 
			
			
			//Get Execution Status 
			String Exe_status=row.getCell(2).getStringCellValue();
			
			if(Exe_status.equals("y"))
			{
				
				String UID=row.getCell(0).getStringCellValue();
				String PWD=row.getCell(1).getStringCellValue();
				
				System.out.println(UID+"      "+PWD);
				
				
				//Get Scenario type
				String Stype=row.getCell(3).getStringCellValue();
				//Accept condition w.r.t scenario types
				if(Stype.equals("visible"))
				{
					System.out.println("Element visible for => "+UID);
				}
				else if(Stype.equals("p"))
				{
					System.out.println("positive output for => "+UID);
				}
				else if(Stype.equals("n"))
				{
					System.out.println("Negative output for => "+UID);
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("alert outptu for => "+UID);
				}
				else if(Stype.equals("text"))
				{
					System.out.println("text output for => "+UID);
				}
				else
				{
					System.out.println("No scenario matches => "+UID);
				}
				
				
				
			}
			
		
			
		}
		
		
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		fi=new FileInputStream(filepath+filename);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		book.close();  //Save Data
	}

	

}
