package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisibleText(WebElement elementname, String visibletext)
	{
		Select select=new Select(elementname);
		select.selectByVisibleText(visibletext);
		
	}
	public void dropDownSelectByValue(WebElement elementname, String value)
	{
		Select select=new Select(elementname);
		select.selectByValue(value);
	}
	public void dropDownSelectByIndex(WebElement elementname, int intex)
	{
		Select select=new Select(elementname);
		select.selectByIndex(intex);

	}
	public void dragAndDrop(WebElement drag,WebElement drop,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();;
	}
	public void mouseHover(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();;
	}
	public void doubleClick(WebElement element, WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();;
	}
	public void rightClick(WebElement element, WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	public void click(WebElement element, WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.click(element).perform();
	}
}



