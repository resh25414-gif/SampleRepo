package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
public WebDriver driver;
Properties pr;
FileInputStream fileinput;
@BeforeMethod
@Parameters("browser")
public void initilizeBrowser(String browser) throws Exception
{
	try
	{
		pr= new Properties();
		fileinput= new FileInputStream(Constant.CONFIG);
		pr.load(fileinput);
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
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

	//driver.get("https://groceryapp.uniqassosiates.com/admin/login"); //open url using get method
	driver.get(pr.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
	driver.manage().window().maximize(); //maximize the window

}
@AfterMethod
public void browserQuit(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == ITestResult.FAILURE) {
		ScreenshotUtility scrShot = new ScreenshotUtility(); // creating obj
		scrShot.getScreenShot(driver, iTestResult.getName());
	}
	driver.quit();

/*public void closeBrowser()
{
	//driver.close(); //closing current tab
	//driver.quit(); //closing all tabs
}*/


}
}

