package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	//declaration -> @FindBy
	@FindBy(name = "username")
	private WebElement usernameTB;
	@FindBy(name="pwd")
	private WebElement passwordTB;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;
	@FindBy(xpath = "//img[contains(@src,'timer.png')]")
	private WebElement loginPage_logo;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		//PageFactory-> initialize all the elements declared by @findBy
		PageFactory.initElements(driver , this);
		//initElements( WebDriver driver , current Object )
	}
	
	//utilization
	//Utilization
		public void setCredentials(String un,String pw)
		{
			usernameTB.sendKeys(un);
			passwordTB.sendKeys(pw);
		}
		
		public void clickLogin()
		{
			loginBtn.click();
		}
	
		public void verifyLogo()
		{
			Assert.assertTrue(loginPage_logo.isDisplayed());
		}
	
	
	
	
}
