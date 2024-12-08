package CoreElements;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class Toast {

	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1)
	{
		driver=driver1;
	}
    public Toast(By Locator)
    {
    	elementLocator=Locator;
    }
	
	public void VerifyToastName(String ExpectedToastName)
	{
		String ActualToastName=driver.findElement(elementLocator).getDomAttribute("name");
		Assert.assertEquals(ActualToastName, ExpectedToastName);
	}
	
}
