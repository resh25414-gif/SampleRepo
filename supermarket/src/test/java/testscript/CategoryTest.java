package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class CategoryTest extends Base{
	HomePage homepage;
	CategoryPage categorypage;

	@Test(description="Testcase used to check user is able to add new category")
	public void userIsAbleToAddNewCategory() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		 
		 
		 FakerUtility faker=new FakerUtility();
		 String categoryvalue=faker.generateCategory();
		// CategoryPage categorypage=new CategoryPage(driver);
		 
		 categorypage=homepage.openCategoryMoreInfo();
		 categorypage.clickOnNew().enterCategoryDetails(categoryvalue).selectGroupFromMenu().chooseFile(Constant.TESTIMAGE).saveCategory();
		/* categorypage.enterCategoryDetails(categoryvalue);
		 categorypage.selectGroupFromMenu();
		 categorypage.chooseFile(Constant.TESTIMAGE);
		 categorypage.saveCategory();*/
		// boolean alertmessage=categorypage.isAlertDisplayed();
	    // Assert.assertTrue(alertmessage);
		 
	}
}
