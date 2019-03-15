package remotecontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class RcScripting_On_WebDriver_Browser
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Enable RcScripting on WebDriver Browser Using Interface called WebDriverBackedSelenium
		WebDriverBackedSelenium rc=new WebDriverBackedSelenium(driver, "https://");
		
		//Type text into editbox using rc scripting
		rc.type("id=u_0_j", "Rajesh");
		rc.type("xpath=//input[@name='lastname']", "Kiran");
		rc.type("css=#u_0_o", "RajeshKiran@gmail.com");
		
		
		//select dropdown using rc scripting
		rc.select("id=day", "24");
		rc.select("id=month", "May");
		rc.select("id=year", "1990");
		
		//Select Gender radio button
		rc.click("xpath=//input[@value='1']");
		
		//Click Messenger link
		rc.click("link=Messenger");
		
		
		
		//Verify Expected page title presented at window
		if(rc.getTitle().equals("Messenger"))
			System.out.println("Expected title presented");
		else
			System.out.println("Wrong title presented");
		
		
		//Verify alert presented at webpage
		if(rc.isAlertPresent())
			driver.switchTo().alert().accept();
		else
			System.out.println("alert was not presented");
		
		
		//Verify element visible at webapge
		if(rc.isVisible("xpath=//input[@name='email']"))
			System.out.println("Element visible at webpage");
		else
			System.out.println("element not visible at webpage");
		
		
		//Verify text presented at webpage
		if(rc.isTextPresent("Be together, whenever."))
			System.out.println("Text presented at webpage");
		else
			System.out.println("text not presented at webpage");
		
		
		//javasript on automation browser
		rc.getEval("document.getElementById('email').value='Sunil'");
		
	
		
		
		
		
		
	}

}
