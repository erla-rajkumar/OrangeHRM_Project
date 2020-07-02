package actClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActionClassMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		
		WebElement sar = driver.findElement(By.xpath("//a[text()='SAREES']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(sar).perform();
		Thread.sleep(2000);
		WebElement cotton_sar = driver.findElement(By.xpath("(//a[text()='Cotton Sarees'])[1]"));
		act.contextClick(cotton_sar).perform();
		
		//Robot -> java class-> AWTException Abstract window toolkit
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		
		
		
		
	}
}
