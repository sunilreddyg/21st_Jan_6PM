package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//By Using ID locator for dropDown
		//Day
//		new Select(driver.findElement(By.id("day"))).selectByIndex(24);
//		new Select(driver.findElement(By.id("day"))).selectByValue("18");
        new Select(driver.findElement(By.id("day"))).selectByVisibleText("29");
		//Month
//		new Select(driver.findElement(By.id("month"))).selectByIndex(7);
//		new Select(driver.findElement(By.id("month"))).selectByValue("5");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Nov");
		
		//year
//		new Select(driver.findElement(By.id("year"))).selectByIndex(26);
//		new Select(driver.findElement(By.id("year"))).selectByValue("1989");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		
		//By using ID locator for Radiobutton
//		driver.findElement(By.id("u_0_a")).click();
//		driver.findElement(By.id("u_0_a")).sendKeys(Keys.SPACE);
		
		
		//By Using Linktext locator for links
//		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//By using partial linktext
		driver.findElement(By.partialLinkText("Fo")).click();
		
		
		
		
	}

}
