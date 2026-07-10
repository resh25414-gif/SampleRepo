package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageLocationPage {
	public WebDriver driver;
	PageUtility page=new PageUtility();
@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-location\" and @class='small-box-footer']") WebElement managelocation;
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newlocation;
@FindBy(xpath="//select[@id=\"country_id\"]") WebElement country;
@FindBy(xpath="//select[@id='st_id']") WebElement state;
@FindBy(xpath="//input[@id=\"location\"]") WebElement location;
@FindBy(xpath="//input[@id='delivery']") WebElement deliverycharge;
@FindBy(xpath="//button[@type='submit']") WebElement save;

public ManageLocationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void clickOnManageLocation()
{
	managelocation.click();
}
public void clickNew()
{
	newlocation.click();
}
public void selectCountry(String countryvalue)
{
	page.dropDownVisibleText(country, countryvalue);
}
public void selectState(String statevalue)
{
	page.dropDownVisibleText(state, statevalue);
}
public void enterLoaction(String locationvalue)
{
	location.sendKeys(locationvalue);
}
public void enterDeliveryCharge(String deliverycharagevalue)
{
	deliverycharge.sendKeys(deliverycharagevalue);
}
public void saveDetails()
{
	save.click();
}

}
