package handlingPopUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(al.getText());
		al.accept();
		// NoAlertPresentException -> accessing alert popup after being handled
//		 performing any actions on alert popup -> where popup doesnt exists
	}
}
