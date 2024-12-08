package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;

public class FormField  {
	
	public static AndroidDriver driver;
	By elementLocator;
	
	public static void SetDriver(AndroidDriver driver1) //3mllto set driver lwa7do brdo 3shan dh msh 3aml extend ll Elements 
	//f lazem yb2a m3ahom nafs l driver 2ly et3ml fl initiate
	{
		driver=driver1;
	}
	
	public FormField(By Locator) //3mltlo Constructor leh lwa7do 3shan dh msh 3amlo extend mn Elements
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
