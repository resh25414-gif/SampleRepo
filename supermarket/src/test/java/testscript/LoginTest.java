package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"})
	public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
	String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	
	loginpage.enterUserName(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	 loginpage.login();
	}
	@Test
	public void verifyUserIsAbleToLoginWithIncorrectPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		 loginpage.login();
	}
	@Test
	public void verifyUserIsAbleToLoginWithIncorrectUsername() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		 loginpage.login();
	}
	@Test
	public void verifyUserIsAbleToLoginWithInValidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		 loginpage.login();
	}
	
}
