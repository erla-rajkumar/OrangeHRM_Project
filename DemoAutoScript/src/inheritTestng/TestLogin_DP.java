package inheritTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.LoginPage;

public class TestLogin_DP extends BaseClass {
  
	@Test(dataProvider = "dp")
    public void verifyLogin(String username,String password) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setCredentials(username, password);
		lp.clickLogin();
		Thread.sleep(4000);
     }
	
	@DataProvider
	public String[][] dp()
	{
		return new String[][] {{"admin","manager"},{"ad min","manager"},{"@123admin","manager"},{"  ","manager"}};
	}
	
	
	
	
}
