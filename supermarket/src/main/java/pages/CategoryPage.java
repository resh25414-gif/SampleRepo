package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class CategoryPage {
	public WebDriver driver;
	
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement categorymoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement addnew;
	@FindBy(xpath="//input[@id='category']") WebElement entercategory;
	@FindBy(xpath="//span[text()='Goodness']") WebElement selectgroup;
	@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successalert;
	
	FileUploadUtility fileupload=new FileUploadUtility();
    PageUtility page=new PageUtility();
	//JavascriptExecutor js;
	
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void openCategory()
	{
		categorymoreinfo.click();
	}*/
	public CategoryPage clickOnNew()
	{
		addnew.click();
		return this;
	}
	public CategoryPage enterCategoryDetails(String categoryvalue)
	{
		entercategory.sendKeys(categoryvalue);
		return this;
	}
	public CategoryPage selectGroupFromMenu()
	{

		selectgroup.click();
		return this;

	}
	public CategoryPage chooseFile(String testimage)
	{
	fileupload.fileUploadUsingSendKeys(choosefile, testimage);
	return this;
	}
	public CategoryPage saveCategory()
	{
		//save.click();
		page.click(save, driver);
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return successalert.isDisplayed();
	}


}
