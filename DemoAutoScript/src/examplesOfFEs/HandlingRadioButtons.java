package examplesOfFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day4/Demo.html");

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='g']"));
		
		for(WebElement e:radio)
		{
			e.click();
			Thread.sleep(1000);
		}
		
		
		
	}	
}
