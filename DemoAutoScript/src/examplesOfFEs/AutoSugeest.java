//handling augo suggestion and printing them

package examplesOfFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugeest {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
		driver.switchTo().activeElement().sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> var = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		for(WebElement we:var)
		{
			System.out.println(we.getText());
		}
		
	}
	

}
