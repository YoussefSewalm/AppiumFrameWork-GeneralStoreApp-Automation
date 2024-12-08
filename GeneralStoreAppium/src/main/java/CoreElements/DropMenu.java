package CoreElements;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DropMenu {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) 
	{
		driver=driver1;
	}
	
	public DropMenu(By Locator) //Constructor
	{
		elementLocator=Locator;
	}
	public void SelectItemFromDropMenu(String Country)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
		        ".scrollIntoView(new UiSelector().text(\"" + Country + "\").instance(0))")).click(); 
	}
	public void Click()
	{
		driver.findElement(elementLocator).click();
	}
}
