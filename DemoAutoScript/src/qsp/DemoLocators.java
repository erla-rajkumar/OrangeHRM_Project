package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
//		driver.findElement(By.tagName("input")).sendKeys("selenium");
		
//		driver.findElement(By.linkText("Google")).click();
		
//		driver.findElement(By.id("gmail1")).click();
		
		
//		driver.findElement(By.linkText("Images")).click();
		
//		driver.findElement(By.partialLinkText("Ima")).click();
		
//		driver.findElement(By.cssSelector("input[data='age']")).sendKeys("18");
		
		
		WebElement var= driver.findElement(By.id("hplogo"));
//		googleTB.sendKeys("selenium");
//		googleTB.sendKeys(Keys.ENTER);
//		googleTB.clear();
//		System.out.println(var.getAttribute("title"));
//		driver.get(var.getAttribute("href"));
		
//		System.out.println(var.getText());
		
//		System.out.println(var.getCssValue("color"));
		
//		Point loc = var.getLocation();
//		
//		int x= loc.getX();
//		int y= loc.getY();
//		
//		System.out.println("x axis "+x+" y axis "+y);
		
		
//		Rectangle dim = var.getRect();
//		dim.getX();
//		dim.getY();
//		int l = dim.getHeight();
//		int b= dim.getWidth();
//		System.out.println(l);
//		System.out.println(b);
//
//		Dimension s = var.getSize();
//		s.getHeight();
//		s.getWidth();
		
//		System.out.println(var.getTagName());
		
		System.out.println(var.isDisplayed());
		
		var.submit();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
