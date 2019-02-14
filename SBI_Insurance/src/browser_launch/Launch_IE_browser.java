package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * download IEDriverServer:-->
		 * 		=> URl:-->https://www.seleniumhq.org/download/
		 * 		=> Under The Internet Explorer Driver Server
		 * 			download IEDriverServer w.r.t Hotspot size.
		 * 		=> Download IEDriverServer w.r.t Selenium version
		 * 	    => Set Runtime path before launch IE browser
		 * 
		 * 
		 *   Note:--> IE is a secured browser we must disable privacy
		 *   			settings before launch
		 *   		
		 *   => Zoom level should be 100
		 *   => Disable all security popus  [Internet Options]
		 *   => IE browser versions ---> IE8, IE9,IE10,IE11 
		 */
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		
		
	}

}
