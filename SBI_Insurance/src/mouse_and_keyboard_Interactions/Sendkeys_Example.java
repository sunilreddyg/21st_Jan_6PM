package mouse_and_keyboard_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		
		//Identify frame and switch to it
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Demo_frame);
		
		WebElement List=driver.findElement(By.xpath("//span[@class='ui-selectmenu-text'][contains(.,'Medium')]"));
		List.click();
		
		//Enable mouse and keyboard interactions at web browser
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.chord("Medium")).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.ENTER).perform();
	}

}
