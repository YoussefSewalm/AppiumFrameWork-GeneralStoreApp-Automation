package GeneralStoreTests;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import AppiumUtils.AppiumInitiatorNativeAndHybird;

import static AppiumUtils.AppiumInitiatorNativeAndHybird.*;

import static AppiumUtils.AppiumInitiatorNativeAndHybird.*;


public class TestBase extends AppiumInitiatorNativeAndHybird{

	@BeforeClass(alwaysRun=true)
	public static void Navigate() throws URISyntaxException, IOException
	{
		AppiumInitiatorNativeAndHybird.DriverInitiator();
	}
	

	
	@AfterClass(alwaysRun=true)
	public static void EndSessions()
	{
		AppiumInitiatorNativeAndHybird.EndSession();
	}
}
