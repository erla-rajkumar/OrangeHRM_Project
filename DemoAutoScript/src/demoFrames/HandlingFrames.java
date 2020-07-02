package demoFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import inheritTestng.BaseClass;

public class HandlingFrames extends BaseClass {
	
	@Test
	public void testFrame() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("sagar");
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("nag");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='i_frame']"));
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("ID or name Attribute value");
//		driver.switchTo().frame(WEbElement);
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("deptInfo")).sendKeys("Automation");
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		p.clear();
		
		
		Thread.sleep(5000);
	}
	
	

}
