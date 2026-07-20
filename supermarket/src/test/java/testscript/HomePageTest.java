package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomePageTest extends Base{
	HomePage homepage;
	
	@Test(description="Testcase used to check user is able to logout after login with valid username and password")
	public void verifyWhetherTheUserIsAbleToLogout() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		
		//HomePage logout=new HomePage(driver);
		homepage.clickOnAdmin();
		homepage.clickOnLogout();
		boolean alertmessage=homepage.isLoginpageDisplayed();
		Assert.assertTrue(alertmessage);
		
		
	}
}
