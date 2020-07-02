package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.LoginPage;

public class TestInvalidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		LoginPage lp=new LoginPage(driver);
//		PageFactory.initElements(driver, lp);
		lp.setCredentials("admin","manager");
		lp.clickLogin();

	}

}
