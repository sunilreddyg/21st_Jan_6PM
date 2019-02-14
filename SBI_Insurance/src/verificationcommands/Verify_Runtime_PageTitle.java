package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Throwables;

public class Verify_Runtime_PageTitle 
{

	public static void main(String[] args)
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.com");
		driver.manage().window().maximize();

		//capture runtime page title
		String Runtime_title=driver.getTitle();
		System.out.println("current window title is => "+Runtime_title);
			
		//Expected title
		String exp_title="Selenium - Web Browser Automation";

		
		//Verify equal comparision between Runtime title to expected title
		boolean flag=Runtime_title.equals(exp_title);
		
		//Write Decision statement to Execute on expected title match
		if(flag=true)
		{
			System.out.println("Expected title presented");
		}
		else
		{
			System.out.println("Wrong title presented");
		}
		
	}

}
