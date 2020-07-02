package inheritTestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void productInfo()
	{
		Reporter.log("This is an employee time sheet management tool",true);
	}
	
	@BeforeTest
	public void setPro()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("./data/notepad.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeApp()
	{
		//testng listners
		driver.quit();
	}
	
	@AfterSuite
	public void excelReport()
	{
		//handle XL
		Reporter.log("excel report is generated",true);
	}


}
