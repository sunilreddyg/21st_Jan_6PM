package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_page_visibleText {

	public static void main(String[] args) throws Exception
	{
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
		
		//identify whole page using body tag
		WebElement Page=driver.findElement(By.tagName("body"));
		//Gettext on page
		String Page_visibleText=Page.getText();
		
		
		String Exp_text="Couldn't find your Google Account";
		//Verify page visible text contains expected text
		if(Page_visibleText.contains(Exp_text))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
	}

}
