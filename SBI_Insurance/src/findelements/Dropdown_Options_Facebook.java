package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Options_Facebook 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify Month Dropdown
		WebElement month_dropdown=driver.findElement(By.id("month"));

		//Get All option tags under dropdown element
		List<WebElement> Dropdown_options=month_dropdown.findElements(By.tagName("option"));
		
		//Get size of dropdown options
		int DCount=Dropdown_options.size();
		
		//Iterate for number of dropdown options
		for (int i = 0; i < DCount; i++) 
		{
			//Using get method identify any single element with help of index number
			WebElement Eachoption=Dropdown_options.get(i);
			Eachoption.click();
			
		}
		
		
		
		
	}

}
