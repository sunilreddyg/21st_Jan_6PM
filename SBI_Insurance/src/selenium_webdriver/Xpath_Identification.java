package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Identification {

	public static void main(String[] args) 
	{
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='u_0_j']")).clear();
		driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("Newuser");
		
		
		
	}

}
