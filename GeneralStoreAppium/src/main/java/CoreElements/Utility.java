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
		//NOTE ana hena 2olt findELement(S) ya3ny kol l Indexes ml a5er 3shan h loop 3lehom
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
		//AHAM 7AGA l INSTANCE 0 DEH 3SHAN DEH 2ly btozbot l scroll sa7
	}
	public void VerifyTotalPriceInCart(By Locator_3)
	{
		int NumberOfProductsInCart=driver.findElements(elementLocator).size(); //findElement(S) brdo
		double ActualTotalPrice=0;
		for(int i=0;i<NumberOfProductsInCart;i++)
		{
			Double ProductPrice=Double.parseDouble(driver.findElements(elementLocator).get(i).getText().substring(1));
			//Hena ana 3mlt get text ll price bs dh keda hy2ba String ana 3yz a7wlo Double (3shan fe decimal)
			//3ayez a7wlo rakam 3shan a3rf a3ml addition 3shan at2ked mn al Summation bta3 total price
			//w 3malt Substring mn awl index 1 ya3ny shelt index 0 2ly hwa 3lamet l '$' 3shan a3rf a3ml parse
			//(a7wl) l double
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
//deh lma bakon 3ayez abda2 mn saf7a mo3yna fl app 2ly b3mlo test 3yz abd2 l test mn saf7et l products 3ala tol
//msln , sa3etha lazm l awal aro7 3al emulator w aro7 l saf7et l products deh w afta7 l cmd w aktb l Line dh
//3shan a3rf l AppPackageName (2ly abl l slash) w a3rf l AppActivityName (2ly ba3d l slash)
//Hktb keda fl cmd: //adb shell dumpsys window | find "mCurrentFocus"
//w bkeda hb2a 3reft PackageName wl ActivityName hpassehom b2a ll fun deh 3la tool, w b keda law 3malt run 
//hla2y awl saf7a ft7t m3ya automatic hya l Products
		

    	((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
    		    "intent",AppPackageName+"/"+AppActivityName
    		));
        //NOTE Momken aktb 2ly fo2 b shakl tany w a3rf ana l map (l map deh fl jaava zy List aw array)
        
        //Map<String,String> arguments_4= new HashMap<String,String>();
        //arguments_4.put("intent",AppPackageName+"/"+AppActivityName);
        //driver.executeScript("mobile: startActivity",arguments_4);
    
	}

}
