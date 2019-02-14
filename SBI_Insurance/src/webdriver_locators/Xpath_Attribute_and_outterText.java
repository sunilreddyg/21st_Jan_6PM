package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_and_outterText 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	
		
		
		/*
		 * identify location using element text
		 * 		//tagnmae[text()='Element text']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		Thread.sleep(8000);
		
		/*
		 * identify location using element attribute
		 * 		//tagname[@ propertyname = 'propertyvalue']
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("Software Testing,");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Webdriver']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Testng']")).click();
		Thread.sleep(2000);

	}

}
