package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriverMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.craftsvilla.com");
		// navigate().to() --> enter the URL
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("selenium");
		
		//go back
//		driver.navigate().back();
//		Thread.sleep(2000);
		//go forward
//		driver.navigate().forward();
//		Thread.sleep(2000);
		//refresh 
//		driver.navigate().refresh();
		
//		get the current URL of the WebPage
//		System.out.println(driver.getCurrentUrl());
		
		//gives the front end source code of the application html/css/javascript
//		System.out.println(driver.getPageSource());
		
//		System.out.println(driver.getTitle());
		
		

		
		Thread.sleep(2000);
		driver.quit();
	}

}
