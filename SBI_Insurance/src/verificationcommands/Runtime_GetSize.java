package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetSize {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//identify location
		WebElement sensex_tab=driver.findElement(By.id("InvestRec"));
		
		//Identify Element height and width
		Dimension obj_dimension=sensex_tab.getSize();
		
		//Get Element object height and width
		int obj_height=obj_dimension.getHeight();
		int obj_width=obj_dimension.getWidth();
		
		System.out.println("Object height is => "+obj_height);
		System.out.println("Object width is => "+obj_width);

		//Verify element visibility using object height and width
		if(obj_height  > 0)
			System.out.println("object visible");
		else
			System.err.println("object hidden");
		
		
	}

}
