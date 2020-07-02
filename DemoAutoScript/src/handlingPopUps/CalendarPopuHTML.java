package handlingPopUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopuHTML {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/policies/instantpay/renew");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,200)");
		WebElement policyNoTB = driver.findElement(By.id("policyNumber"));
		policyNoTB.sendKeys("i dont know");
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
//		element.click();
		String date="14-03-2019";
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
		
	}
}
