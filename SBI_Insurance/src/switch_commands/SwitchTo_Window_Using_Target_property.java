package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Target_property {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://telanganaepass.cgg.gov.in/#");
		driver.manage().window().maximize();
		
		
		
		/*
		 * <a href="SCDD-RTIManual.pdf" target="new">RTI Manual</a>
		 * 
		 * 	=>We can switch to newwindow using extenal link target property
		 */
		
		//Identify External link
		WebElement External_link=driver.findElement(By.linkText("RTI Manual"));
		External_link.click();
		Thread.sleep(5000);
		
		
		driver.switchTo().window("new");
		
		Thread.sleep(5000);
		System.out.println("Focused window is => "+driver.getTitle());
		
		
		
		
		
		
		
		

	}

}
