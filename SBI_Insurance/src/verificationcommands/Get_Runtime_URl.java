package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_URl {

	public static void main(String[] args) 
	{
		
		/*
		 * Automation Testcase:-->
		 * 		Verify NR Forex Rates link at HDFC bank NRI page
		 * 	Steps:-->
		 * 		Launch browser window
		 * 		load hdfc bank url
		 * 		maximize window  [optional]
		 * 		click NRI link at homepage
		 * 		click NR forex link at NRI page.
		 * 		
		 * 	Expected:-->
		 * 		System should display Forex page with Details		
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		System.out.println("window maximized and ready to use");
		
		//click NRI link at hdfc homepage
		WebElement NRI_link=driver.findElement(By.xpath("//a[@href='/nri_banking/home.htm']"));
		NRI_link.click();
		
		//click NR forex rates link at NRI page
		WebElement NR_forex_rates_link=driver.findElement(By.xpath("//a[@title='NR Forex rate applicable for Inward remittances']"));
		NR_forex_rates_link.click();
		
		
		String exp_url="nri_banking/Foreign_Exchng_Rates/Foreign_Exchng_Rates.asp";
		
		
		//Capture current window url
		String Runtime_url=driver.getCurrentUrl();
		
		//Verify Expected url at Runtime url
		if(Runtime_url.contains(exp_url))
			System.out.println("Expected page display on NR forex rates link");
		else
			System.out.println("wrong page dispalyed on NR forex rates link");
	}

}
