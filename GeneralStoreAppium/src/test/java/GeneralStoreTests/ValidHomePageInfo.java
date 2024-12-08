package GeneralStoreTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static CoreElements.Utility.*;
import static AppiumUtils.AppiumInitiatorNativeAndHybird.*;
import static Pages.P0_WelcomePage.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ValidHomePageInfo extends TestBase {

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
	public void ValidHomePageDetails(HashMap<String,String> input)
	{
      GeneralStore.VerifyCriticalTextExists("General Store");
      Nationality.Click();
      Nationality.SelectItemFromDropMenu(input.get("nationality"));
      NameForm.SendText(input.get("name"));
      Male.Check();
      LetsShop.Click();
	}
}