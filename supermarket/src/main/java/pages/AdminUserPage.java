package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminuser;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newuser;
	@FindBy(xpath="//input[@id='username']") WebElement newusername;
	@FindBy(xpath="//input[@id='password']") WebElement newpassword;
	@FindBy(xpath="//select[@id='user_type']") WebElement selecttype;
	@FindBy(xpath="//button[@name='Create']") WebElement save;
	
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnAdminUser()
	{
		adminuser.click();
	}
	public void clickNew()
	{
		newuser.click();
	}
	public void enterUsername(String newusernamevalue)
	{
		newusername.sendKeys(newusernamevalue);
	}
	public void enterPasswordValue(String newpasswordvalue)
	{
		newpassword.sendKeys(newpasswordvalue);
	}
	public void selectUserType(String usertypevalue)
	{
		PageUtility pageutility=new PageUtility();
		pageutility.dropDownSelectByValue(selecttype, usertypevalue);
	}
	public void saveDetails()
	{
		save.click();
	}

}
