package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_UserInput_From_Editbox 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("qadarshan@gmail.com");
		
		
		//Get Input value from editbox
		String Runtime_username=username.getAttribute("value");
		System.out.println("=> "+Runtime_username);
		

	}

}
