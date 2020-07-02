package examplesOfFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDownList {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/capgemini/day4/Demo.html");
		
		//single select drop down list
		WebElement SingleSelectDDL = driver.findElement(By.id("s1"));
		Select ss=new Select(SingleSelectDDL);
//		System.out.println(ss.isMultiple());
//		ss.selectByIndex(4);
//		ss.selectByValue("v4");
//		ss.selectByVisibleText("Kerala");
//		ss.deselectByValue("v6");
		
		WebElement multiSelectDDL = driver.findElement(By.xpath("//select[@title='food']"));
		Select ms=new Select(multiSelectDDL);
		System.out.println(ms.isMultiple());
		ms.selectByIndex(0);
		ms.selectByValue("t2");
		ms.selectByVisibleText("Veg Biryani");
		
		// to fetch all the selected options from the multi select DDL
		List<WebElement> allSelected = ms.getAllSelectedOptions();
		for(WebElement we:allSelected)
		{
			System.out.println("all selected options "+we.getText());
		}
		// it used to fetch the first selected option from the top 
		WebElement firstSelected = ms.getFirstSelectedOption();
		System.out.println("first selected option "+firstSelected.getText());
		
		//it is used to fetch all the options of the DDL
		List<WebElement> allOPtions = ms.getOptions();
		for(WebElement we:allOPtions)
		{
			System.out.println("all options are "+we.getText());
		}
		
		//its is similar to getOptions() -> wraps all the options and return as WebElement
		WebElement wrapEle = ms.getWrappedElement();
		System.out.println("wrapped options are "+wrapEle.getText());
		
//		ms.deselectByIndex(2);
//		ms.deselectByValue("t1");
//		ms.deselectByVisibleText("Dosa");
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
