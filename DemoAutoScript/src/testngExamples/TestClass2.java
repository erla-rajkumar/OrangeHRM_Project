package testngExamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
 
	@Test
  public void method2() {
		Reporter.log("test class 2",true);
  }
}
