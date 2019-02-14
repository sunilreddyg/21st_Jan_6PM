package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe
		 * 	=> https://www.seleniumhq.org/download/
		 * 	=> Under --Third Party Browser Drivers NOT DEVELOPED by seleniumhq
		 * 	=> click GoogleChromedriver link
		 * 	=> Under Latest release click on download link
		 * 	=> Under download page selected chromedriver version
		 * 	
		 *  =>URL:--> https://chromedriver.storage.googleapis.com/index.html?path=2.45/
		 *  => Download w.r.t OS and Hotspot size
		 *  => Download zip format file --> chromedriver_win32.zip
		 *  => unzip file to project folder...
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	}

}
