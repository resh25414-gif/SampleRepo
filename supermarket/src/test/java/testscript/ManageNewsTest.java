package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	@Test
	public void verifyUserIsAbleToEnterNewNews() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.login();
		
		String newsvalue=ExcelUtility.getStringData(1, 0, "newspage");
		
		ManageNewsPage newspage=new ManageNewsPage(driver);
		newspage.clickOnManageNews();
		newspage.clickOnNew();
		newspage.enterNews(newsvalue);
		newspage.saveNews();
		boolean alertmessage=newspage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}

}
