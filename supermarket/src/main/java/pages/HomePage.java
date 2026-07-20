package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-location\" and @class='small-box-footer']") WebElement managelocationmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminusermoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement categorymoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider' and @class='small-box-footer']") WebElement mobileslidermoreinfo;

	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
    @FindBy(xpath="//div[@class='login-box']") WebElement loginpage;
    
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}

public ManageNewsPage clickOnManageNewsMoreInfo()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	managenewsmoreinfo.click();
	return new ManageNewsPage(driver);
}
public ManageLocationPage clickOnManageLocationMoreInfo()
{
	managelocationmoreinfo.click();
	return new ManageLocationPage(driver);
}
public AdminUserPage clickOnAdminUserMoreInfo()
{
	adminusermoreinfo.click();
	return new AdminUserPage(driver);
}
public CategoryPage openCategoryMoreInfo()
{
	categorymoreinfo.click();
	return new CategoryPage(driver);
}
public MobileSliderPage openMobileSliderMoreInfo()
{
	mobileslidermoreinfo.click();
	return new MobileSliderPage(driver);
	
}
public void clickOnAdmin()
{
	admin.click();
}
public void clickOnLogout()
{
	logout.click();
}
public boolean isLoginpageDisplayed()
{
	return loginpage.isDisplayed();
}
}
