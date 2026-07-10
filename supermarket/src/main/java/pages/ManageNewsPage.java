package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newnews;
	@FindBy(xpath="//textarea[@id='news']") WebElement news;
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successalert;
	
public ManageNewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickOnManageNews()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	managenews.click();
}
public void clickOnNew()
{
	newnews.click();
}
public void enterNews(String newsvalue)
{
	news.sendKeys(newsvalue);
}
public void saveNews()
{
	save.click();
}
public boolean isAlertDisplayed()
{
	return successalert.isDisplayed();
}
{
	
}

}
