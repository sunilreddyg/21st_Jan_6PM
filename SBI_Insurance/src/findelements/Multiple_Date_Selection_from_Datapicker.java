package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.modules.thread.thread;

public class Multiple_Date_Selection_from_Datapicker {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Identify Departure date
		WebElement Departuredate=driver.findElement(By.id("dpt_date"));
		Departuredate.click();
		Thread.sleep(1000);
		
		
		
		//Iterate for expected range
		for (int i = 0; i <= 3; i++) 
		{
			
			
			//Target Current Month table
			WebElement Current_month;
			Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Identify only active dates under current month
			List<WebElement> Active_dates;
			Active_dates=Current_month.findElements(By.tagName("a"));
			
			//Itereate for active dates
			for (int j = 0; j < Active_dates.size(); j++) 
			{
				
				//select Each date
				WebElement Eachdate=Active_dates.get(j);
				Eachdate.click();
				Thread.sleep(1000);
				
				//Open calendar
				Departuredate.click();
				
				
				//Restore all active dates at current month
				Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_dates=Current_month.findElements(By.tagName("a"));
				
			}
			
			
			
			
			//IDentify Next month button
			WebElement Next_month_btn=driver.findElement(By.id("cal_showNextMonth"));
			Next_month_btn.click();
			Thread.sleep(2000);
			
		}
	}

}
