package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGroups {
	
	@Test(groups = "smkTesting")
	public void method1()
	{
		Reporter.log("Performing Smoke Testing",true);
	}
	
	@Test(groups = {"smkTesting","funTesting"})
	public void method2()
	{
		Reporter.log("Performing Smoke Testing / Functional Testing",true);
	}
	
	@Test(groups = {"funTesting","intTesting"})
	public void method3()
	{
		Reporter.log("Performing Funtional Testing / Integration Testing",true);
	}
	
	@Test(groups = "regTesting")
	public void method4()
	{
		Reporter.log("Performing Regression Testing",true);
	}
	
	@Test(groups = {"sysTesting","intTesting"})
	public void method5()
	{
		Reporter.log("Performing System Testing / Integration Testing",true);
	}
	
	
	
	

}
