package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autocomplete_Editbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Click Roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();

		//Identify departure city autocomplete editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);   //Wait until all list of option displayed
		//Click City Option
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify arrival city autocomplete editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(4000);   //Wait until all list of option displayed
		//Click City Option
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//select Departure city from datepicker.
		driver.findElement(By.linkText("20")).click();
		
		
		//Type Date into arrival date editbox
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Wed, 15 May, 2019");
		
		//Select adults options
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		//Select childrens option
		new Select(driver.findElement(By.id("Childrens")))
		.selectByValue("2");
		
		//select Infants option
		new Select(driver.findElement(By.id("Infants")))
		.selectByIndex(1);
		
		//Click link using partial name
		driver.findElement(By.partialLinkText
				("Class of travel, Airline preference")).click();
		Thread.sleep(4000);
		
		
		//Select Dropdown option using  xpath locator
		driver.findElement(By.xpath("/html/body/section[2]/div/div/ul/li/div/div[2]/div[1]/div/form/div[5]/section/div[1]/dl/dd/select/option[2]")).click();
		
		
		//Select Option from autocomplete editbox
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		//Click button to finish search
		driver.findElement(By.id("SearchBtn")).click();
		
	}
}
