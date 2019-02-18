package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_ElementText {

	public static void main(String[] args) throws Exception {
		

		/*
		 * Testcase:--> Verify gmail email validation with invalid domain name
		 * Steps;-->
		 * 			Launch chromebrowser
		 * 			load Gmail homepage
		 * 			Enter invalid domain name 
		 * 			click Next button
		 * Expected:-->
		 * 			System should throw appropriate error msg.
		 */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Enter invalid email with invalid domain-name
		WebElement Signin_email_eb=driver.findElement(By.id("identifierId"));
		Signin_email_eb.clear();
		Signin_email_eb.sendKeys("qadarshan@outlook.com",Keys.ENTER);
		Thread.sleep(5000);
		
		
		//Identify location using class property
		WebElement Error_location=driver.findElement(By.className("GQ8Pzc"));
		//Capture text from location at runtime
		String Error_text=Error_location.getText();
		
		
		/*
		 * get text method catpure only visible text.
		 */
		
		//Verify system capture runtime text
		if(!Error_text.isEmpty())
		{
			System.out.println("text captured");
			
			String Exp_text="Couldn't find your Google Account";
			if(Error_text.equals(Exp_text))
				System.out.println("As expected error msg displayed on invalid domain");
			else
				System.out.println("Testfail expected error msg not displayed");
		}
		else
			System.out.println("text not captured return empty");
	}

}
