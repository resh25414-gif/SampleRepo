package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base {
	HomePage homepage;
	ManageLocationPage managelocation;

	@Test(description="Testcase used to check user is able to add new location")
	public void userIsAbleToAddNewLocation() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.login();
		 
		String countryvalue=ExcelUtility.getStringData(1, 0, "managelocationpage");
		String statevalue=ExcelUtility.getStringData(1, 1, "managelocationpage");
		String locationvalue=ExcelUtility.getStringData(1, 2, "managelocationpage");
		String deliverycharagevalue=ExcelUtility.getStringData(1, 3, "managelocationpage");
		
		/*String countryvalue="United Kingdom";
		String statevalue="Belfast";
		String locationvalue="asdfg";
		String deliverycharagevalue="100-200";*/
		
		//ManageLocationPage managelocation=new ManageLocationPage(driver);
		managelocation=homepage.clickOnManageLocationMoreInfo();
		managelocation.clickNew().selectCountry(countryvalue).selectState(statevalue).enterLoaction(locationvalue).enterDeliveryCharge(deliverycharagevalue).saveDetails();
		/*managelocation.selectCountry(countryvalue);
		managelocation.selectState(statevalue);
		managelocation.enterLoaction(locationvalue);
		managelocation.enterDeliveryCharge(deliverycharagevalue);
		managelocation.saveDetails();*/
		
		boolean alertmessage=managelocation.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
		
		
	}
}
