package inheritTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;

public class TestLogin_PARAM extends BaseClass {

	@Test
	@Parameters({"username","password"})
    public void verifyLogin(String username,String password) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setCredentials(username, password);
		lp.clickLogin();
		Thread.sleep(4000);
     }
	
	
	
	
}
