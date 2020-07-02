package handlingPopUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleBrowserChildPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//address of the current GUI object
//		System.out.println(driver.getWindowHandle());
		driver.get("https://www.naukri.com");
		//gWhs() -> more than 1 browser
		Set<String> whs = driver.getWindowHandles();
		// set -> duplicate address browser is not accepted -> no confussion
		for(String s:whs)
		{
			System.out.println(s);
		}
		
		Iterator<String> it = whs.iterator();
		String homeBrowser = it.next();
		String child1 = it.next();
		String child2 = it.next();
		
		driver.switchTo().window(child1).close();
		driver.switchTo().window(child2).close();
		driver.switchTo().window(homeBrowser);
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		
	}
		
}
