package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin;
	@FindBy(xpath="//img[@class='img-circle']") WebElement homepage;
	@FindBy(xpath="//button[@type='button']") WebElement alertbox;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public LoginPage enterUserName(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
		return this;
	}
	public LoginPage enterPassword(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
	public HomePage login()
	{
	 signin.click();
	 return new HomePage(driver);
	}
	public boolean isHomePageloaded()
	{
		return homepage.isDisplayed();
	}
    public boolean isAlertDisplayed()
    {
    	return alertbox.isDisplayed();
    }
}
