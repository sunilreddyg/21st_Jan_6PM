package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Between_Frames {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		
		//Identify Frame
		WebElement packageframe=driver.findElement(By.cssSelector("frame[title='All Packages']"));
		//Switch to frame using frame location
		driver.switchTo().frame(packageframe);
		
		//click Link under packagelistframe
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//get Controls to mainpage
		driver.switchTo().defaultContent();
		//Switch to frame using name property
		driver.switchTo().frame("packageFrame");
		
		//click link under package frame
		driver.findElement(By.linkText("Alert")).click();
		
		//get Controls to mainpage
		driver.switchTo().defaultContent();
		//using index number switch to frame
		driver.switchTo().frame(2);
		
		//click link under class frame
		driver.findElement(By.linkText("accept")).click();
		driver.switchTo().defaultContent();
		
		
		//close browser
		Thread.sleep(10000);
		driver.close();
		
		
		
		
	}

}
