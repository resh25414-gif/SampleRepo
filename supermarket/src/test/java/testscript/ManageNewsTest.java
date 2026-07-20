package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	HomePage homepage;
	ManageNewsPage newspage;
	@Test(description="Testcase used to check user is able to add new news")
	public void verifyUserIsAbleToEnterNewNews() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		
		String newsvalue=ExcelUtility.getStringData(1, 0, "newspage");
		
		//ManageNewsPage newspage=new ManageNewsPage(driver);
		newspage=homepage.clickOnManageNewsMoreInfo();
		newspage.clickOnNew().enterNews(newsvalue).saveNews();
		//newspage.enterNews(newsvalue);
		//newspage.saveNews();
		boolean alertmessage=newspage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}

}
