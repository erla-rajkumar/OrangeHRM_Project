package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import inheritTestng.BaseClass;
import page.LoginPage;

public class DemoAssertTestCase extends BaseClass{

	
	@Test
	public void TYSS_TC01() throws InterruptedException
	{
		SoftAssert sa=new SoftAssert(); 
		sa.assertEquals(driver.getTitle(),"actiTIME - Login");
		
		LoginPage lp=new LoginPage(driver);
		lp.verifyLogo();
		lp.setCredentials("admin", "manager");
		lp.clickLogin();
		Thread.sleep(5000);
		sa.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		Thread.sleep(5000);
		sa.assertAll();
	}

}
