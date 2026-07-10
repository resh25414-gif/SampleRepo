package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class CategoryPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement category;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement addnew;
	@FindBy(xpath="//input[@id='category']") WebElement entercategory;
	@FindBy(xpath="//span[text()='Goodness']") WebElement selectgroup;
	@FindBy(xpath="//input[@id='main_img']") WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	
	FileUploadUtility fileupload=new FileUploadUtility();
    PageUtility page=new PageUtility();
	//JavascriptExecutor js;
	
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}
	public void openCategory()
	{
		category.click();
	}
	public void clickOnNew()
	{
		addnew.click();
	}
	public void enterCategoryDetails(String categoryvalue)
	{
		entercategory.sendKeys(categoryvalue);
	}
	public void selectGroupFromMenu()
	{

		selectgroup.click();

	}
	public void chooseFile(String testimage)
	{
	fileupload.fileUploadUsingSendKeys(choosefile, testimage);
	}
	public void saveCategory()
	{
		//save.click();
		page.click(save, driver);
	}


}
