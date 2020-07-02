package examplesOfFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day4/Demo.html");

		List<WebElement> cBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		// for loop for checking
	   for (int i=0;i<cBoxes.size();i++)
	   {
		   cBoxes.get(i).click();
		   System.out.println(i+""+cBoxes.get(i).isSelected());
	   }
		
//		for each loop for un checking
		for(WebElement we:cBoxes)
		{
			we.click();
		}
		
	}

}
