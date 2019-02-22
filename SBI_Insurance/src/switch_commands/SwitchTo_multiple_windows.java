package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_multiple_windows {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Switch to main window
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("main window Dynamic id => "+driver.getWindowHandle());
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All window IDS
		Set<String> AllwindowIDS=driver.getWindowHandles();
		for (String Eachwindow : AllwindowIDS) 
		{
			//switch to all windows
			driver.switchTo().window(Eachwindow);
			//Capture each window runtime title
			String Runtime_title=driver.getTitle();
			
			if(Runtime_title.contains("Indian Railway Seat Availability"))
			{
				break;  //break iteration
			}
		}//
		
		System.out.println("Current focused window is => "+driver.getTitle());
		
		
	}

}
