package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Dropdown_Selection 
{

	public static void main(String[] args) 
	{
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch brwoser
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify dropdown location
		driver.findElement(By.id("day")).sendKeys("12");
		
		//Identify month dropdown
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		

		//Select dropdown option using keyboard shortcuts
		driver.findElement(By.id("year")).sendKeys("2012");
		
	}

}
