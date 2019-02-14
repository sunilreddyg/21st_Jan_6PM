package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_Name_class {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/mobile/Credit-Card_TU.aspx?SourceCode=HNET&Promocode=P4_FlipCoin_AppOnl1_homepage_CC_TU&_ga=2.38949795.1877255186.1549249966-1291739286.1523247784");
		driver.manage().window().maximize();
		
		//By using name locator for textbox
		driver.findElement(By.name("txtName")).sendKeys("mindqdsnr");
		//By using Css Selector for radiobutton
		driver.findElement(By.cssSelector("label[for='r1s']")).click();
		
		//By using name locator for DOB Field
		driver.findElement(By.name("txtDOB")).click();
		
		//By using class name locator for Dropdown
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByIndex(5);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByValue("1989");
		
		//by using linktetxt locator for links
		driver.findElement(By.linkText("19")).click();
		
		//By using name locator for textbox
		driver.findElement(By.name("txtMobile")).sendKeys("123467890");
		driver.findElement(By.name("txtEmailID")).sendKeys("mindqdsnr@gmail.com");
		
		new Select(driver.findElement(By.name("ddlCity"))).selectByValue("HYDERABAD");
		
		driver.findElement(By.name("txtPincode")).sendKeys("123456");
		driver.findElement(By.name("txtPancard")).sendKeys("12345678");
		
		new Select(driver.findElement(By.name("ddlIncome"))).selectByVisibleText("45000-55000");
		
		//By Using Name locator for check box
		driver.findElement(By.name("chkAutho")).click();
		
		
		

	}

}
