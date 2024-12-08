package CoreElements;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Buttons {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) //3mllto set driver lwa7do brdo 3shan dh msh 3aml extend ll Elements 
	//f lazem yb2a m3ahom nafs l driver 2ly et3ml fl initiate
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
