package actClassMethods;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.colive.in/");
		
		
		WebDriverWait wait=new WebDriverWait( driver, 10);
//		wait.until(ExpectedConditions.titleContains("Sagar"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("z")));
		WebElement element = driver.findElement(By.xpath(""));
		wait.until(ExpectedConditions.invisibilityOf(element));
		element.click();
		
		driver.switchTo().activeElement().sendKeys("selenium");
		
		
	}
}
