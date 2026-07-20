package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	HomePage homepage;
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"}, description="Testcase used to check user is able to login with valid username and password")
	public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
	String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	
	loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
	//loginpage.enterPassword(passwordvalue);
	 homepage=loginpage.login();
	 boolean alertmessage=loginpage.isHomePageloaded();
	 Assert.assertTrue(alertmessage);
	}
	
	
	@Test(description="Testcase used to check user is able to login with valid username and invalid password")
	public void verifyUserIsAbleToLoginWithIncorrectPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		boolean alertmessage=loginpage.isAlertDisplayed();
		 Assert.assertTrue(alertmessage);
	}
	
	@Test(description="Testcase used to check user is able to login with invalid username and valid password")
	public void verifyUserIsAbleToLoginWithIncorrectUsername() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		 homepage=loginpage.login();
		 boolean alertmessage=loginpage.isAlertDisplayed();
		 Assert.assertTrue(alertmessage);
	}
	
	@Test(description="Testcase used to check user is able to login with invalid username and password")
	public void verifyUserIsAbleToLoginWithInValidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage= loginpage.login();
		boolean alertmessage=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}
	
}
