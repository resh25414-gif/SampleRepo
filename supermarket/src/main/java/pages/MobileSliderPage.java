package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class MobileSliderPage {
	public WebDriver driver;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider' and @class='small-box-footer']") WebElement mobileslider;
@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newslider;
@FindBy(xpath="//select[@id=\"cat_id\"]") WebElement selectcategory;
@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
@FindBy(xpath="//button[@type='submit']") WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;

PageUtility pageutility=new PageUtility();
FileUploadUtility fileupload=new FileUploadUtility();

public MobileSliderPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void openMobileSlider()
{
	mobileslider.click();
	
}
public void selectNewSlider()
{
	newslider.click();
}
public void selectCategoryFromDropdown(String categoryvalue)
{
	pageutility.dropDownVisibleText(selectcategory, categoryvalue);
}
public void chooseFileToUpload(String testimg)
{
	fileupload.fileUploadUsingSendKeys(choosefile, testimg);
}
public void saveDetails()
{
	save.click();
}
public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
}
}
