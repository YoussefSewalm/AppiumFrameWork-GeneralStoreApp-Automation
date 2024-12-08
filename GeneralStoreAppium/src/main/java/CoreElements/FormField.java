package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;

public class FormField  {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) 
	{
		driver=driver1;
	}
	
	public FormField(By Locator) 
	{
		elementLocator=Locator;
	}
	
	public void SendText(String Text)
	{
		driver.findElement(elementLocator).sendKeys(Text);
	}
	public void PressEnter()
	{
		driver.findElement(elementLocator).sendKeys(Keys.ENTER);
	}

}
