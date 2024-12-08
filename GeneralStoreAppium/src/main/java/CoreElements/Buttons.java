package CoreElements;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Buttons {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) 
	{
		driver=driver1;
	}
	
	public Buttons(By Locator) //Constructor
	{
		elementLocator=Locator;
	}
	public void Click()
	{
		driver.findElement(elementLocator).click();
	}

}
