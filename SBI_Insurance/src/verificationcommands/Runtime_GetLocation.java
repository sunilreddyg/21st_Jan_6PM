package verificationcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetLocation 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//identify location
		WebElement sensex_tab=driver.findElement(By.id("InvestRec"));
		
		//Get Element X and Y coordinates
		Point Obj_point=sensex_tab.getLocation();
		//using object poing get element x and y coorindates of object
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		System.out.println("object x coordinates are => "+obj_x);
		System.out.println("object y coordinates are => "+obj_y);
		
	
		//Verify Element visible at webpage
		if(obj_x > 0)
		{
			System.out.println("Object visible at webpage");
		}
		else
		{
			System.out.println("object hidden at webpage");
		}
	}

}
