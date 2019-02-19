package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Selection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		/*
		 * Testcase:--> Verify trip type selection roundtrip radio button.
		 * precondition:--> roundtrip should be selected
		 * Expected:--> Should visible return date container.
		 */
		
		//Select roundtrip radio button
		WebElement Rountrip=driver.findElement(By.id("RoundTrip"));
		Rountrip.click();
		
		//Accept condition on Roundtrip selection
		if(Rountrip.isSelected())
		{
			 //Verify return date visible 
			//Identify Return date
			WebElement Return_Date=driver.findElement(By.id("ReturnDate"));
			if(Return_Date.isDisplayed())
				System.out.println("Return date visible on selection");
			else
				System.out.println("Testfail:-->Return hidden on selection");
		}
		else
			System.out.println("Precondition failed return date not validated");
				

	}

}
