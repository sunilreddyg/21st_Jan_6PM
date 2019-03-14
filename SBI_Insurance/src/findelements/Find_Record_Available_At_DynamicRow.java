package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Record_Available_At_DynamicRow 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify Market link
		WebElement market_links=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		market_links.click();
		
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each Dynamic row at table
			WebElement DynamicRow=rows.get(i);
			
			//Capture text on Each Row
			String RowText=DynamicRow.getText();
			
			//Accept Condition where any record match in dynamic row
			if(RowText.contains("HDFC"))
			{
				
				System.out.println("Row Number is => "+i);
				
				//using Dynamic row find List of Cells
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Required Cell
				WebElement Company_Cell=cells.get(0);
				WebElement HighPrice_Cell=cells.get(3);
				
				String CompanyName=Company_Cell.getText();
				String HighPrice=HighPrice_Cell.getText();
				
				System.out.println(CompanyName+"   "+HighPrice);
			}
			
		}
		
		
		

	}

}
