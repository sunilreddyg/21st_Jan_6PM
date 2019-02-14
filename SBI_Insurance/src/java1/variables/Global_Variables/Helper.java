package java1.variables.Global_Variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper
{
	public WebDriver driver=null;   //instant variable
	String url="http://facebook.com";
	
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void close_browser()
	{
		driver.close();
	}

}
