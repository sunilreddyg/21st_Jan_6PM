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

public class JunitTest_Read_TestCase_From_Excel 
{
	static String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\datadriver_Framework\\";
	static String sheetname="Sheet2";
	static String filename="InputData.xlsx";
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static WebDriver driver;
	
	
	@Test
	public void Tc001_Email_Validation_With_ValidData() throws InterruptedException
	{
		 String Appurl=row.getCell(1).getStringCellValue();
		 driver.get(Appurl);
		 
		 //Get Singin button locator
		 String Signin_btn_locator=row.getCell(2).getStringCellValue();
		 driver.findElement(By.xpath(Signin_btn_locator)).click();
		 
		 //Get Email locator and Email input Data
		 String Email_locator=row.getCell(3).getStringCellValue();
		 String Email_input=row.getCell(4).getStringCellValue();
		 driver.findElement(By.xpath(Email_locator)).clear();
		 driver.findElement(By.xpath(Email_locator)).sendKeys(Email_input);
		 
		 //Get Next button locator
		 String Next_btn_locator=row.getCell(5).getStringCellValue();
		 driver.findElement(By.xpath(Next_btn_locator)).click();
		 Thread.sleep(5000);
		 
		 
	}

	@Test
	public void Tc002_Email_Validation_With_InvalidData() throws Exception
	{
		 String Appurl=row.getCell(1).getStringCellValue();
		 driver.get(Appurl);
		 
		 //Get Singin button locator
		 String Signin_btn_locator=row.getCell(2).getStringCellValue();
		 driver.findElement(By.xpath(Signin_btn_locator)).click();
		 
		 //Get Email locator and Email input Data
		 String Email_locator=row.getCell(3).getStringCellValue();
		 String Email_input=sht.getRow(2).getCell(4).getStringCellValue();
		 driver.findElement(By.xpath(Email_locator)).clear();
		 driver.findElement(By.xpath(Email_locator)).sendKeys(Email_input);
		 
		 //Get Next button locator
		 String Next_btn_locator=row.getCell(5).getStringCellValue();
		 driver.findElement(By.xpath(Next_btn_locator)).click();
		 Thread.sleep(5000);
		 
	
	}
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		fi=new FileInputStream(filepath+filename);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		row=sht.getRow(1);
		
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
