package handlingPopUps;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day8/upload.html");
		
		
		WebElement uploadBtn = driver.findElement(By.id("i1"));
		//sendKeys("Absolute_Path")
//		uploadBtn.sendKeys("C:\\Users\\LENOVO\\Desktop\\capgemini\\selenium_WS\\DemoAutoScript\\data\\data.xlsx");
	
		//relative path
		File f=new File("./data/data.xlsx");
		String abs = f.getAbsolutePath();
		uploadBtn.sendKeys(abs);
		
		
	}
	
	
}
