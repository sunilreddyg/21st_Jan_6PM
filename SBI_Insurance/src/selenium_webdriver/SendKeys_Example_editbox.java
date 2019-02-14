package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Example_editbox {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//IDentify FirstName Editbox at webpage
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Newuser",
		Keys.TAB,"webdriver",
		Keys.TAB,"arjun@gmail.com",
		Keys.TAB,"arjun@gmail.com",
		Keys.TAB,"Hello12345");
		
		Thread.sleep(3000);
		
		
		//Identify Day Dropdown--And select dropdown option using keyboard shortcut.
		driver.findElement(By.id("day")).sendKeys("24");
		
		//Identify Month dropdown --And Select Dropdown opiton using keybord shotcut
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		

	}

}
