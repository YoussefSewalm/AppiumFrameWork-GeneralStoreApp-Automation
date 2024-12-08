package CoreElements;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class CheckBox {

	public static AndroidDriver driver;
    By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1)
	{
		driver=driver1;
	}
	
	public CheckBox(By Locator) //Constructor
	{
		elementLocator=Locator;
	}
	public void Check()
	{
		driver.findElement(elementLocator).click();
	}
}
