package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebookLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com");
		
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
//		driver.findElement(By.id("email")).sendKeys("hnsagarnag2gmail.com");
//		
//		driver.findElement(By.name("pass")).sendKeys("dfghjggfdf");
//		
//		driver.findElement(By.id("u_0_b")).click();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("selenium");
		
		driver.findElement(By.cssSelector("input[value='Next']")).click();
		

	}

}
