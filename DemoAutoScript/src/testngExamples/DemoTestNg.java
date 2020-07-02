package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg {
	
	@Test
	public void method1()
	{
		Reporter.log("test class 1",true);
	}

//	@Test(enabled = false)
//	public void login()
//	{
//		Reporter.log("user login",true);
//	}
//	
//	@Test(invocationCount = 0)
//	public void performTask()
//	{
//		Reporter.log("user performs task",true);
//	}
//	
//	@Test(enabled = false)
//	public void logout()
//	{
//		Reporter.log("user logout",true);
//	}
	
	
}
