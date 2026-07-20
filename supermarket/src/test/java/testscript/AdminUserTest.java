package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	HomePage homepage;
	AdminUserPage adminuserpage;
	
	@Test(description="Testcase used to check user is able to add new user details")
	public void verifyUserIsAbleCreateNewUserProfile() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		String newusernamevalue=ExcelUtility.getStringData(1, 0, "adminuserpage");
		String newpasswordvalue=ExcelUtility.getStringData(1, 1, "adminuserpage");
		String usertypevalue=ExcelUtility.getStringData(1, 2, "adminuserpage");
		//AdminUserPage adminuserpage=new AdminUserPage(driver);
		
		adminuserpage=homepage.clickOnAdminUserMoreInfo();
		adminuserpage.clickNew().enterUsername(newusernamevalue).enterPasswordValue(newpasswordvalue).selectUserType(usertypevalue).saveDetails();
		/*adminuserpage.enterUsername(newusernamevalue);
		adminuserpage.enterPasswordValue(newpasswordvalue);
		adminuserpage.selectUserType(usertypevalue);
		adminuserpage.saveDetails();*/
		boolean alertmessage=adminuserpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}

}
