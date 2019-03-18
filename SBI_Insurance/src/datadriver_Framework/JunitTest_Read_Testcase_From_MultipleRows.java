package datadriver_Framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest_Read_Testcase_From_MultipleRows {

	static String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\";
	static String sheetname="Sheet3";
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
			
			String UID=row.getCell(0).getStringCellValue();
			String PWD=row.getCell(1).getStringCellValue();
			
			System.out.println(UID+"      "+PWD);
			
			
			//Get Data from static cell
			String URL=sht.getRow(0).getCell(1).getStringCellValue();
			String UID_Locator=sht.getRow(1).getCell(1).getStringCellValue();
			String PWD_Locator=sht.getRow(2).getCell(1).getStringCellValue();
			String Signin_btn=sht.getRow(3).getCell(1).getStringCellValue();
			
			//Load webpage
			driver.get(URL);
			
			//Enter Username
			driver.findElement(By.xpath(UID_Locator)).clear();
			driver.findElement(By.xpath(UID_Locator)).sendKeys(UID);  //Input from Dynamic ROW
			
			//Enter password
			driver.findElement(By.xpath(PWD_Locator)).clear();
			driver.findElement(By.xpath(PWD_Locator)).sendKeys(PWD);  //Input from Dynamic ROW
			
			//Click Next button
			driver.findElement(By.xpath(Signin_btn)).click();
		}
		
		
	}
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		fi=new FileInputStream(filepath+filename);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		
		//browser initiation
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
		book.close();  //Save Data
	}
}
