package waitcommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_and_verify_title 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("Selenium - Web Browser Automation"));
		System.out.println("title verified");
		
		/*
		 * Note:--> Explicitwait throws "Timeout exception" In case
		 * 			expected behaviour not found.
		 */
	}

}
