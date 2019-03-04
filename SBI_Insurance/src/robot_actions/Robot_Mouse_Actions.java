package robot_actions;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Mouse_Actions {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@value='exp']")).click();
		Thread.sleep(3000);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.mouseMove(400, 266);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		
		//Identify Editbox
		WebElement Mobile=driver.findElement(By.name("number"));
		robot.mouseMove(Mobile.getLocation().getX(), Mobile.getLocation().getY());
		robot.mousePress(InputEvent.BUTTON1_MASK);
		
		
		robot.keyPress(KeyEvent.VK_9);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_3);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_2);
		

	}

}
