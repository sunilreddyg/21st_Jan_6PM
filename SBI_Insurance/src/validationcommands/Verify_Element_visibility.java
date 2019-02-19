package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_visibility 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Testcase:--> Verify trip type selection oneway radio button.
		 * Expected:--> Should hide return date container
		 */
		
		//select oneway radio button
		WebElement Onway_trip=driver.findElement(By.id("OneWay"));
		Onway_trip.click();
		
		//Identify Return date
		WebElement Return_Date=driver.findElement(By.id("ReturnDate"));
		
		if(!Return_Date.isDisplayed())   //!--NOT
		{
			System.out.println("As expected return date hidden at webpage");
		}
		else
		{
			System.out.println("Testfail expected return date should be hidden");
		}
		
		
		//Timeout to execute next testcase
		Thread.sleep(10000);
		
	
		/*
		 * Testcase:--> Verify trip type selection roundtrip radio button.
		 * Expected:--> Should visible return date container.
		 */
		
		
		//Select roundtrip radio button
		WebElement Rountrip=driver.findElement(By.id("RoundTrip"));
		Rountrip.click();
		
		
		//Verify return date visible at webpage
		if(Return_Date.isDisplayed())
			System.out.println("Testpass As expected Return date visible on roundtrip selection");
		else
			System.out.println("Testfail Expected return date shoule be visible");
		
	}

}
