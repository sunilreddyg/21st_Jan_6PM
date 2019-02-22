package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) 
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
			//Accept condition where mainwindow not equals with Eachwindow
			if(!EachWindowID.equals(mainWindowID))  //!--NOT
			{
				driver.switchTo().window(EachWindowID);
				break;  //break loop after window switched
			}
		}
		
		System.out.println("Focus window is => "+driver.getTitle());

	}

}
