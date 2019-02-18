package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Getcssvalue {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//click Sensex tab
		WebElement sensex_tab=driver.findElement(By.id("InvestRec"));
		sensex_tab.click();
		Thread.sleep(3000);
		
		//Verify Sensex tab selection
		
		//Get Element color or bg-color
		String Act_bg_color=sensex_tab.getCssValue("background-color");
		System.out.println("bg_color is => "+Act_bg_color);
		
		if(Act_bg_color.equals("rgba(231, 120, 23, 1)"))
			System.out.println("sensex tab selected bg-color get changed");
		else
			System.out.println("sensex tab not selected bg-color mismatch");
		
		
		//Get Element font-size
		String Element_font_size=sensex_tab.getCssValue("font-size");
		System.out.println("text font-size at element is => "+Element_font_size);
		
		
		
		
		
		
	}

}
