package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base{

	@Test(description="Testcase used to check user is able to logout after login with valid username and password")
	public void verifyWhetherTheUserIsAbleToLogout() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.login();
		
		LogoutPage logout=new LogoutPage(driver);
		logout.clickOnAdmin();
		logout.clickOnLogout();
		
		
	}
}
