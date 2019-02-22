package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SwitchTo_Active_Element {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//identify elemnet
		WebElement Exp_salary=driver.findElement(By.xpath("//input[contains(@id,'cjaMinSal')]"));
		Exp_salary.click();
		Thread.sleep(5000);
		
		//Statement switch to active elemnet at webpage
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
		

	}

}
