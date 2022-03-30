package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.PagesLogin;

public class LoginT extends BaseClass {

	@Test
	public void FailedLogin() {
		test = report.startTest("Failed Login");
		PagesLogin Login1 = new PagesLogin();
		Login1.LoginFunction("problem_user", "Abcd@1234");
		WebElement errMsg = driver.findElement(By.cssSelector("h3[data-test='error']"));
		String ActMsg = errMsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActMsg, ExpMsg);
		
	}
	@Test
	public void PassLogin() {
		test = report.startTest("Successful Login");
		PagesLogin Login1 = new PagesLogin();
		Login1.LoginFunction("standard_user", "secret_sauce");
	}
	
}
