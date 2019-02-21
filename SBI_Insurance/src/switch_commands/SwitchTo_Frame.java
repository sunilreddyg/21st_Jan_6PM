package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame 
{

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Identify frame at webpage
		WebElement Modal_Frame=driver.findElement(By.id("modal_window"));
		//apply switch to frame
		driver.switchTo().frame(Modal_Frame);
		
		
		//Identif Email location
		WebElement Email=driver.findElement(By.name("email"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		
		//Identify tripID location
		WebElement TripId=driver.findElement(By.id("tripidSecond"));
		TripId.clear();
		TripId.sendKeys("1231544645");
		
		//Get Controls back to mainapge
		driver.switchTo().defaultContent();
		
		
		//Click flights link under Page
		WebElement Flights=driver.findElement(By.linkText("Flights"));
		Flights.click();
		
		
		
		
		
		

	}

}
