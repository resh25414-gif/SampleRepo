package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminusermoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newuser;
	@FindBy(xpath="//input[@id='username']") WebElement newusername;
	@FindBy(xpath="//input[@id='password']") WebElement newpassword;
	@FindBy(xpath="//select[@id='user_type']") WebElement selecttype;
	@FindBy(xpath="//button[@name='Create']") WebElement save;
	@FindBy(xpath="//button[@type='button']") WebElement successalert;
	
	PageUtility pageutility=new PageUtility();

	
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnAdminUser()
	{
		adminusermoreinfo.click();
	}*/
	public AdminUserPage clickNew()
	{
		newuser.click();
		return this;
	}
	public AdminUserPage enterUsername(String newusernamevalue)
	{
		newusername.sendKeys(newusernamevalue);
		return this;
	}
	public AdminUserPage enterPasswordValue(String newpasswordvalue)
	{
		newpassword.sendKeys(newpasswordvalue);
		return this;
	}
	public AdminUserPage selectUserType(String usertypevalue)
	{
		pageutility.dropDownSelectByValue(selecttype, usertypevalue);
		return this;
	}
	public AdminUserPage saveDetails()
	{
		save.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return successalert.isDisplayed();
	}

}
