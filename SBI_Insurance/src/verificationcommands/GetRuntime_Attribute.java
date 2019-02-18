package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Multicity Location
		WebElement Multi_city=driver.findElement(By.xpath("//label[text()='multi-city']"));
		Multi_city.click();
		
		//Get Runtime propertyvalue using attribute name
		String Runtime_Class=Multi_city.getAttribute("class");
		
		//Verify multicity selection
		if(Runtime_Class.contains("flight-trip-type"))
		{
			System.out.println("MultiCity Selected");
			
				//Verify addcity button visible on multicity selection
				WebElement AddCity_btn=driver.findElement(By.id("addModifyBtn"));
				if(AddCity_btn.isDisplayed())
					System.out.println("Add city visible on multicity selection");
				else
					System.out.println("Add city hidden on multicity sleection");
		}
		else
		{
			System.out.println("multicity is not selected");
		}

	}

}
