package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download geckodriver for firefox
		 * 
		 * 		=> Google --> geckodriver releases
		 * 		=> URL:--> https://github.com/mozilla/geckodriver/releases?after=v0.9.0
		 * 		=> Choose geckodriver version [v0.24.0]  [65+ browser]
		 * 		=> Download w.r.t operating system
		 * 		=> Download zip format file and unzip location to project
		 * 
		 */
		//Set up geckodriver path at runtime
		String path="C:\\Users\\Administrator\\Desktop\\browser_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		//Initiate browser using webdriver interface class
		WebDriver driver=new FirefoxDriver();
		//Load webpage to webdriver initiated browser window
		driver.get("http://google.com");

	}

}
