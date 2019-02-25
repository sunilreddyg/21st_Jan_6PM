package mouse_and_keyboard_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On_Element 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		
		
		/*
		 * Actions:-->
		 * 		Actions class contains set of mouse and
		 * 		keyboard interaction methods.
		 * 
		 * 		Enable mouse and keyboard interaction on automation browser
		 */
		Actions action=new Actions(driver);
		
		WebElement Category=driver.findElement(By.xpath("//span[@class='nav-line-1'][contains(.,'Shop by')]"));
		action.moveToElement(Category).perform();
		Thread.sleep(4000);
		
		WebElement Mobiles_and_computers=driver.findElement(By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]"));
		action.moveToElement(Mobiles_and_computers).perform();
		Thread.sleep(4000);
		
		WebElement Laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		action.click(Laptops).perform();  //click using mouse actions
				
	}

}
