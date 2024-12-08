package GeneralStoreTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static CoreElements.Utility.SetActivity;
import static Pages.P0_WelcomePage.*;

public class InValidHomePageInfo extends TestBase {

	@BeforeMethod(alwaysRun=true)
	public void SetHomePageActivity()
	{
		SetActivity("com.androidsample.generalstore","com.androidsample.generalstore.SplashActivity");
	}
	@Test(groups= {"Regression"} )
	public void InvalidHomePageDetails()
	{
      GeneralStore.VerifyCriticalTextExists("General Store");
      Nationality.Click();
      Nationality.SelectItemFromDropMenu("Egypt");
      Male.Check();
      LetsShop.Click();
      PleaseEnterYourName.VerifyToastName("Please enter your name");
	}
}
