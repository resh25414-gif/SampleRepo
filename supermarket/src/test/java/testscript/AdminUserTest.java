package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	
	@Test
	public void verifyUserIsAbleCreateNewUserProfile() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.login();
		String newusernamevalue=ExcelUtility.getStringData(1, 0, "adminuserpage");
		String newpasswordvalue=ExcelUtility.getStringData(1, 1, "adminuserpage");
		String usertypevalue=ExcelUtility.getStringData(1, 2, "adminuserpage");
		AdminUserPage adminuserpage=new AdminUserPage(driver);
		
		adminuserpage.clickOnAdminUser();
		adminuserpage.clickNew(); 
		adminuserpage.enterUsername(newusernamevalue);
		adminuserpage.enterPasswordValue(newpasswordvalue);
		adminuserpage.selectUserType(usertypevalue);
		adminuserpage.saveDetails();
	}

}
