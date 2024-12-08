package CoreElements;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Elements extends AppiumUtils.AppiumInitiatorNativeAndHybird {
	
	static AndroidDriver driver;
	By elementLocator;
	
	public Elements(By Locator) //Constructor
	{
		elementLocator=Locator;
	}
	
	public static void SetDriver(AndroidDriver driver1)
	{
	  driver=driver1;
	}
	public void ScrollToEndAction(String Direction)
	{
		boolean caniscroll;
		do {
		caniscroll=(Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", Direction,
			    "percent", 1.0
			));
		}while(caniscroll);
	}
	public void ScrollToUsingJavaExecutorScript(String Direction)
	{
		boolean caniscroll;
		do {
		caniscroll=(Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId(),
			    "direction", Direction,
			    "percent", 1.0
			));
		}while(caniscroll);
	}
    public void LongClickGesture()
    {
    	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
    			"elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId(),
    			"duration",2000
    			));
    }
    public void DragAndDrop(int x,int y)
    {
    	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
    		    "elementId", ((RemoteWebElement)driver.findElement(elementLocator)).getId(),
    		    "endX", x,
    		    "endY", y
    		));
    }
    public void Swipe(String Direction,double percentage)
    {
        Assert.assertEquals(driver.findElement(elementLocator).getDomAttribute("focusable"),"true");
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
        		"elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId(),
        	    "direction", Direction,
        	    "percent", percentage
        	));        
        Assert.assertEquals(driver.findElement(elementLocator).getDomAttribute("focusable"),"false");
    }


	public static void SwitchDriver()
	{
		Set<String> ContextHandles=driver.getContextHandles();
		for(String Handle:ContextHandles)
		{
			System.out.println(Handle);
		}
	}


}
