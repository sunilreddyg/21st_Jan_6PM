package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_commands 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.com");
		driver.manage().window().maximize();
		
		
		//capture runtime page title
		String page_title=driver.getTitle();
		System.out.println("current window title is => "+page_title);
		
		//capture runtime page url
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+page_url);
		
		//Capture runtime window ID [Helps switch between windows]
		String Runtime_WindowID=driver.getWindowHandle();
		System.out.println("Runtime window ID is =. "+Runtime_WindowID);
		
		//Capture element pagesource
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
	}

}
