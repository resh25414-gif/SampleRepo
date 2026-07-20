package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageLocationPage {
	public WebDriver driver;
	PageUtility page=new PageUtility();
//@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-location\" and @class='small-box-footer']") WebElement managelocationmoreinfo;
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newlocation;
@FindBy(xpath="//select[@id=\"country_id\"]") WebElement country;
@FindBy(xpath="//select[@id='st_id']") WebElement state;
@FindBy(xpath="//input[@id=\"location\"]") WebElement location;
@FindBy(xpath="//input[@id='delivery']") WebElement deliverycharge;
@FindBy(xpath="//button[@type='submit']") WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successalert;

public ManageLocationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
/*public void clickOnManageLocation()
{
	managelocationmoreinfo.click();
}*/
public ManageLocationPage clickNew()
{
	newlocation.click();
	return this;
}
public ManageLocationPage selectCountry(String countryvalue)
{
	page.dropDownVisibleText(country, countryvalue);
	return this;
}
public ManageLocationPage selectState(String statevalue)
{
	page.dropDownVisibleText(state, statevalue);
	return this;
}
public ManageLocationPage enterLoaction(String locationvalue)
{
	location.sendKeys(locationvalue);
	return this;
}
public ManageLocationPage enterDeliveryCharge(String deliverycharagevalue)
{
	deliverycharge.sendKeys(deliverycharagevalue);
	return this;
}
public ManageLocationPage saveDetails()
{
	save.click();
	return this;
}
public boolean isAlertDisplayed()
{
	return successalert.isDisplayed();
}
}
