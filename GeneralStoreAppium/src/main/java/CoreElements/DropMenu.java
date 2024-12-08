package CoreElements;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DropMenu {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) //3mllto set driver lwa7do brdo 3shan dh msh 3aml extend ll Elements 
	//f lazem yb2a m3ahom nafs l driver 2ly et3ml fl initiate
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
		//AHAM 7AGA l INSTANCE 0 DEH 3SHAN DEH 2ly btozbot l scroll sa7
	}
	public void Click()
	{
		driver.findElement(elementLocator).click();
	}
}
