package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {

	@Test
	public void testA()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(sum, 90000);
		Reporter.log("hey im executed ",true);
		sa.assertAll();
	}
	
	
	
	
}
