package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class Utility extends Elements{

	public Utility(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	public void AddToCart(String ExpectedProductName,By Locator_2)
	{
		int NumberOfProductsShownInCurrentView=driver.findElements(Locator_2).size();
		for(int i=0;i<NumberOfProductsShownInCurrentView;i++)
		{
			String ActualProductName=driver.findElements(Locator_2).get(i).getText();	
			if(ActualProductName.equalsIgnoreCase(ExpectedProductName))
			{
				driver.findElements(elementLocator).get(i).click();
			}
		}	
	}
	public static void ScrollToAndSelectUsingUIAutomator(String Text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
		        ".scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))"));
	}
	public void VerifyTotalPriceInCart(By Locator_3)
	{
		int NumberOfProductsInCart=driver.findElements(elementLocator).size(); //findElement(S) brdo
		double ActualTotalPrice=0;
		for(int i=0;i<NumberOfProductsInCart;i++)
		{
			Double ProductPrice=Double.parseDouble(driver.findElements(elementLocator).get(i).getText().substring(1));
			ActualTotalPrice+=ProductPrice;
		}
		double ExpectedTotalPrice=Double.parseDouble(driver.findElement(Locator_3).getText().substring(1));
		Assert.assertEquals(ActualTotalPrice,ExpectedTotalPrice);
	}
	public static void SwitchToMobileContext()
	{
		driver.context("NATIVE_APP");	
	}
	public static void SwitchToWebContext()
	{
		driver.context("WEBVIEW_com.androidsample.generalstore");
	}
	public static void SetActivity(String AppPackageName,String AppActivityName)
	{	
    	((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
    		    "intent",AppPackageName+"/"+AppActivityName
    		));
	}
}
