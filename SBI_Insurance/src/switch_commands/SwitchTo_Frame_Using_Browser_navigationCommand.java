package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Browser_navigationCommand
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		

		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//button[@class='login-btn']"));
		Signin_btn.click();
		
		
		//navigate to frame
		driver.navigate().to("https://www.redbus.in/account?pageName=Hotels");
		
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		Thread.sleep(5000);
		
		
		//Navigate back to mainpage
		driver.navigate().back();
		
		
		//Click buses link at mainpage
		driver.findElement(By.xpath("//a[@title='redBus.in']")).click();
		
		
		
	}

}
