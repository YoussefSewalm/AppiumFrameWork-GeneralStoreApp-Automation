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
	//If I Need to scroll but I Dont have clue about the element so This is next method to go with
	//it returns true if i can scroll way more and false if i cant scroll more so i can automate this better
	//if i put the actual build in a do while loop (NOTE: IN CASE NO ELEMNT ID I MUST PROVIDE AREA HEIGHT WIDTH)
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
	//Fakes l Scrolling bl JavaScript 3shan by3la2 m3 l mobile apps , 5lena fl UIandroidAutomator
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
        //NOTE Momken aktb 2ly fo2 b shakl tany w a3rf ana l map (l map deh fl jaava zy List aw array)
        
        //Map<String,Object> arguments_3= new HashMap<String,Object>();
        //arguments_3.put("elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId();
        //arguments_3.put("direction",Direction);
        //arguments_3.put("percent","1.0");
        //driver.executeScript("mobile: scrollGesture",arguments_3);
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
        //NOTE Momken aktb 2ly fo2 b shakl tany w a3rf ana l map (l map deh fl jaava zy List aw array)
        
        //Map<String,Object> arguments_2= new HashMap<String,Object>();
        //arguments_2.put("elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId();
        //arguments_2.put("endX",x);
        //arguments_2.put("endY",y);
        //driver.executeScript("mobile: dragGesture",arguments_2);
    }
    public void Swipe(String Direction,double percentage)
    {
        //lazem l awal at2ked fl 7alah l default 2ly fl awal en awl image m3molha focus
        Assert.assertEquals(driver.findElement(elementLocator).getDomAttribute("focusable"),"true");
        //Swipe
        //tlama m3aya element mo3yn ana 3arfo 3ayez a3mlo swipe h7ot l elementId ,,law msh 3arfo
        //sa3etha h7ot direction w percent bs
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
        		"elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId(),
        	    "direction", Direction,
        	    "percent", percentage
        	));
        //w lazem at2ked b3d l swipe en awl sorah mb2ash m3molha focus
        
        //NOTE Momken aktb 2ly fo2 b shakl tany w a3rf ana l map (l map deh fl jaava zy List aw array)
        
        //Map<String,Object> arguments_1= new HashMap<String,Object>();
        //arguments_1.put("elementId",((RemoteWebElement)driver.findElement(elementLocator)).getId();
        //arguments_1.put("direction",Direction);
        //arguments_1.put("percent",percentage);
        //driver.executeScript("mobile: swipeGesture",arguments_1);
        Assert.assertEquals(driver.findElement(elementLocator).getDomAttribute("focusable"),"false");
    }


	public static void SwitchDriver()
	{
		Set<String> ContextHandles=driver.getContextHandles(); //dh Hybrid App ya3ny byb2a fl awal 3al native app context b3d keda by2lb
		//3al Web Browser Context f lazm 3shan a3rf a3ml interact m3 l context 2ly ana feh dlwa2ty
		//lazm abl m interact a3ml switch ll context dh 3shan b3d keda a3rf at3aml m3 l elements 2ly feh
		
		//f ana fl awal h3ml get l kol l handels 2ly mawgoda fl la7za deh w a7othom f List aw Set 
		//w b3d keda hrun 3lehom b for loop 3shan get kol asamy l context 2ly mawgoda 3shan a3rf 
		//esmhom eh blzabt
		//3shan a3ml pass l esm l context bl zabt 2ly ana 3ayez a2lb 3leh
		for(String Handle:ContextHandles)
		{
			System.out.println(Handle);
		}
		//lma 3malt run awl mrh gebt asamy l handles w b keda ana msh m7tag l function dh a3mlha run tany
		//NATIVE_APP ---dh Context l Mobile
		//WEBVIEW_com.androidsample.generalstore-----dh context l web
	}


}
