package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window {

	public static void main(String[] args) throws Exception 
	{
		//Verify alert presented at webpage
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//It capture current window dynamic ID
		String mainWindowID=driver.getWindowHandle();
		System.out.println(mainWindowID);
		
		
		//Identify external link and click to Open page at newwindow.
		WebElement Instagram_link=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		Instagram_link.click();
		
		
		//Get All windows
		Set<String> AllwindowIDS=driver.getWindowHandles();
		//Apply foreach loop
		for (String EachWindowID : AllwindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
		
		Thread.sleep(5000);
		System.out.println("Window focused at => "+driver.getTitle());
		
		
		//Enter values at Instagram window
		WebElement Mobile=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile.clear();
		Mobile.sendKeys("9030248855");
		Thread.sleep(5000);
		
		//Close active window
		driver.close();
		
		
		//Apply switch to mainWindow
		driver.switchTo().window(mainWindowID);
		
		
		System.out.println("Window Focused => "+driver.getTitle());
		
		
		
	}

}
