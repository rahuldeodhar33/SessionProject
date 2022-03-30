package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import TestCase.BaseClass;

//import TestCase.BaseClass;

public class PagesLogin {
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	//WebElement sName = driver.findElement(By.cssSelector("input[id=user-name]"));
	//WebElement Password = driver.findElement(By.cssSelector("input[id=password]"));
	//WebElement LoginBtn = driver.findElement(By.cssSelector("input[id='login-button']"));
	@FindBy (id="user-name")
	WebElement sName;
	@FindBy (id="password")
	WebElement pwd;
	@FindBy (id="login-button")
	WebElement LoginBtn;
	public PagesLogin() {
		PageFactory.initElements(driver, this);
	}
	public void LoginFunction(String UserNames, String Passwords) {
		sName.sendKeys(UserNames);
		test.log(LogStatus.PASS, "Enter User Name.","User Name entered.");
		pwd.sendKeys(Passwords);
		test.log(LogStatus.PASS, "Enter Password.","Password entered.");
		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on Login.","Login Clicked.");
	}
	
}
