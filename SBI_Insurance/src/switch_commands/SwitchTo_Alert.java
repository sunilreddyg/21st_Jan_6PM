package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Testcase:--> Verify job search functionality with invalid Data
		 * Steps:--> 	Given  http://firstnaukri.com
		 * 				when click search button without data entry
		 * 				then receive popup window with text.
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		//Switch control to alert and store into referral
		Alert alert=driver.switchTo().alert();
		//Get text on alert window
		String alert_msg=alert.getText();
		System.out.println("==> "+alert_msg);
		
		//close alert window
		alert.accept();
		
		System.out.println("Run completed");
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */
		
		
		
		
		
		
		
		

	}

}
