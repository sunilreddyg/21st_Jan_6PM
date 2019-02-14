package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver 
{
	public static void main(String[] args) 
	{
		//Set Runtime environment variable for browser driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Initiate browser and store into webdriver referral
		WebDriver driver=new ChromeDriver();
		//Load url to browser window
		driver.get("https://www.facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		//Identify editbox and send characters to editbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		
		//Identify password editbox and send charactes to editbox
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("Hello12345");
		
		//click Sign in button
		driver.findElement(By.id("loginbutton")).click();
	}

}
