package GeneralStoreTests;

import static AppiumUtils.AppiumInitiatorNativeAndHybird.getJsonData;
import static Pages.P0_WelcomePage.*;
import static Pages.P1_ProductsPage.*;
import static Pages.P2_CartPage.*;
import static Pages.P3_WebPageGoogleChrome.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static CoreElements.Utility.SetActivity;
import static Locators.L1_ProductsPage.*;
import static Locators.L2_CartPage.*;
import CoreElements.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductsPage extends TestBase {
	
	@BeforeMethod(alwaysRun=true)
	public void SetHomePageActivity()
	{
		SetActivity("com.androidsample.generalstore","com.androidsample.generalstore.SplashActivity");
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException 
	{
	    String jsonFilePath = System.getProperty("user.dir") + "//src//test//java//resources//generalstoredata.json";
	    List<HashMap<String,String>> data = getJsonData(jsonFilePath);
	    return new Object[][] {   { data.get(0) }   } ;
	}
	@Test(dataProvider="getData",groups= {"Smoke"} )
	public void AddTwoItemsToCart(HashMap<String,String> input) throws InterruptedException
	{
	      GeneralStore.VerifyCriticalTextExists("General Store");
	      Nationality.Click();
	      Nationality.SelectItemFromDropMenu(input.get("nationality"));
	      NameForm.SendText(input.get("name"));
	      Male.Check();
	      LetsShop.Click();
	      ProductsPageVerify.VerifyCriticalTextExists("Products");
	      Utility.ScrollToAndSelectUsingUIAutomator("$110.0");
	      AddToCart.AddToCart("Nike Blazer Mid '77", ProductNamesFromProductPagesText);
	      CartItemsCounter.VerifyCriticalTextExists("1");
	      Utility.ScrollToAndSelectUsingUIAutomator("$130.0");
	      AddToCart.AddToCart("LeBron Soldier 12 ", ProductNamesFromProductPagesText);
	      CartItemsCounter.VerifyCriticalTextExists("2");
	      CartPage.Click();
	      CartPageVerify.VerifyCriticalTextExists("Cart");
	      ProductPricesInCart.VerifyTotalPriceInCart(ActualTotalPriceInCartText);
	      SendMeEmailsOnDiscount.Check();
	      VisitWebsiteToCompletePurchase.Click();
	      Thread.sleep(15000);
	      Utility.SwitchToWebContext();
	      Search.SendText("Rahul Shetty Academy");
	      Search.PressEnter();  
	      Thread.sleep(2000);

	}
	

}
