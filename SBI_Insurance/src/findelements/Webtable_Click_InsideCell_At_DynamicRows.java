package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Click_InsideCell_At_DynamicRows 
{

	public static void main(String[] args) 
	{
		/*
		 * Using referral record name target any Static Cell and click
		 * link inside a cell.
		 */
		

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
		
		boolean flag=false;
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
				flag=true;
				System.out.println("Row Number is => "+i);
				
				//using Dynamic row find List of Cells
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Required Cell
				WebElement NewsCell=cells.get(7);
				//Click Link Inside cell
				NewsCell.findElement(By.tagName("a")).click();
				break;  //stop Iteration
				
			}
			
		}
		
		
		System.out.println("Record available status is => "+flag);
		
		
		

	}

}
