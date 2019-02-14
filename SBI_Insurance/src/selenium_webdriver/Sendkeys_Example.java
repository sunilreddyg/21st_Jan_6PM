package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch brwoser
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("Hello12345",Keys.ENTER);
		
		
		
		
		
	}

}
