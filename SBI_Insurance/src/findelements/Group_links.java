package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//Identify Naviagion links
		WebElement footer_navigation;
		footer_navigation=driver.findElement(By.className("ixdEe"));
		
		//Find number of links available under footer navigation
		List<WebElement> nav_links;
		nav_links=footer_navigation.findElements(By.tagName("a"));
		System.out.println("no of links available is => "+nav_links.size());
		
		
		//Iterate for number of links
		for (int i = 0; i < nav_links.size(); i++)
		{
			
			//target each link
			WebElement Eachlink=nav_links.get(i);
			//get eachlink name
			String linkname=Eachlink.getText();
			//get link href
			String linkhref=Eachlink.getAttribute("href");
			System.out.println(linkname+"   "+linkhref);
			//Click Each link
			
			//Click on each link
			Eachlink.click();
			Thread.sleep(2000);
			
			
			driver.navigate().back();
			
			
			//Restore all links
			footer_navigation=driver.findElement(By.className("ixdEe"));
			nav_links=footer_navigation.findElements(By.tagName("a"));
			
		}
	}

}
