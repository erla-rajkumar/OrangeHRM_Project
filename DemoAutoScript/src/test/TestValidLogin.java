package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.LoginPage;

public class TestValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		LoginPage lp=new LoginPage(driver);
		lp.setCredentials("ad","min");
		lp.clickLogin();
		Thread.sleep(3000);
		lp.setCredentials("admin", "manager");
		lp.clickLogin();

	}

}
