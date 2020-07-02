package actClassMethods;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_DragAndDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day7/doubliclick.html");
		
		WebElement dClick = driver.findElement(By.xpath("//button"));
		
		Actions act=new Actions(driver);
		act.doubleClick(dClick).perform();
		
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day7/drag&drop.html");
		
		WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
		
		WebElement dest = driver.findElement(By.xpath("//p[contains(text(),'Drop')]"));
		
		act.dragAndDrop(src, dest).perform();
		
		
		
		
		
	}
		
}
