package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

      public class DemoRunTimePoly {
	     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Browser ? GC / FC");
		String browser = s.next();
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("FC"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
			System.out.println("Invalid Input");
		driver.get("https://www.google.com");
		
		
		
	}

}
