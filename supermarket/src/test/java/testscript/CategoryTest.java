package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class CategoryTest extends Base{

	@Test(description="Testcase used to check user is able to add new category")
	public void userIsAbleToAddNewCategory() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.login();
		 
		 
		 FakerUtility faker=new FakerUtility();
		 String categoryvalue=faker.generateCategory();
		 CategoryPage categorypage=new CategoryPage(driver);
		 
		 categorypage.openCategory();
		 categorypage.clickOnNew();
		 categorypage.enterCategoryDetails(categoryvalue);
		 categorypage.selectGroupFromMenu();
		 categorypage.chooseFile(Constant.TESTIMAGE);
		 categorypage.saveCategory();
		 
	}
}
