package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling_With_Try_Catch {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Verify alert presented at webpage
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		
		try {
			
			//Switch control to alert and store into referral
			Alert alert=driver.switchTo().alert();
			//Get text on alert window
			String alert_msg=alert.getText();
			System.out.println("==> "+alert_msg);
			
			//close alert window
			alert.accept();
			
		} catch (NoAlertPresentException e) 
		{
			System.out.println(e.getMessage());
		} catch (UnhandledAlertException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Run Completed");

	}

}
