package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
public WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void initilizeBrowser(String browser) throws Exception
{
	if(browser.equalsIgnoreCase("chrome"))
	{
	    driver = new ChromeDriver();

	}
	else if(browser.equalsIgnoreCase("edge"))
	{
	    driver = new EdgeDriver();

	}
	else
	{
		throw new Exception("invalid browser");
	}

	driver.get("https://groceryapp.uniqassosiates.com/admin/login"); //open url using get method
	driver.manage().window().maximize(); //maximize the window

}
@AfterMethod
public void closeBrowser()
{
	//driver.close(); //closing current tab
	//driver.quit(); //closing all tabs
}



}
