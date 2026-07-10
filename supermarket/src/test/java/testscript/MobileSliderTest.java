package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.LoginPage;
import pages.MobileSliderPage;
import utilities.ExcelUtility;

public class MobileSliderTest extends Base{
	@Test
	public void UserIsAbleToCreateNewMobileSlider() throws IOException
	{
	String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	
	loginpage.enterUserName(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.login();
	
	String categoryvalue=ExcelUtility.getStringData(1, 0, "mobilesliderpage");
	//String categoryvalue="Vegetables";
	MobileSliderPage mobileslider=new MobileSliderPage(driver);
	mobileslider.openMobileSlider();
	mobileslider.selectNewSlider();
	mobileslider.selectCategoryFromDropdown(categoryvalue);
	mobileslider.chooseFileToUpload(Constant.TESTIMG);
	mobileslider.saveDetails();
	boolean alertmessage=mobileslider.isAlertDisplayed();
	Assert.assertTrue(alertmessage);
	}

}
