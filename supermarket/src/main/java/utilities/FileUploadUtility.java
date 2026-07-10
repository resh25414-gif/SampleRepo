package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileUploadUsingSendKeys(WebElement elementname, String filepath)
	{
		elementname.sendKeys(filepath);
	}
	public void fileUploadUsingRobotClass(WebElement elementname, String filepath) throws AWTException
	{
		StringSelection obj=new StringSelection("C:\\Users\\Zyair\\Desktop\\java\\jenkins.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj,null);
		Robot ob=new Robot();
		ob.delay(2000);
		ob.keyPress(KeyEvent.VK_CONTROL);//vk-virtual key
		ob.keyPress(KeyEvent.VK_V);
		ob.keyRelease(KeyEvent.VK_CONTROL);
		ob.keyRelease(KeyEvent.VK_V);
		ob.keyPress(KeyEvent.VK_ENTER);
		ob.keyRelease(KeyEvent.VK_ENTER);
	}
	

}