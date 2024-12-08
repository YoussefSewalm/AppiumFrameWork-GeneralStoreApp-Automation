package AppiumUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;

import CoreElements.Buttons;
import CoreElements.CheckBox;
import CoreElements.DropMenu;
import CoreElements.Elements;
import CoreElements.FormField;
import CoreElements.Toast;
import AppiumServer.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumInitiatorForMobileBrowsersOnly extends StartAppiumServer {

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;

	public static void DriverInitiator() throws MalformedURLException, URISyntaxException, IOException
	{
		//To Automate Opening Appium Server (For Mobile Browser Apps Only) From Eclipse	
		//Hena l configuration ll Mobile Browser BAS ya3ny afta7 Chrome msln mn 3al Mobile
		//3shan keda kol l code fl 7alah deh hyb2a SELENIUM msh Appium w kman locate l elements mn 3al Web
		//3an tare2 eny hgeb l responsive view mobile mn l Inspect f Chrome mn 3al PC 3ady w b3d keda a locate
		//w bl taly hena ll AppiumInsepector mlosh ay lazma (3shan dh ll Native bs )
		
		//Hena kol COnfig zy l native wl hybird l far2 eny w ana bfta7 cmd 3shan a run appium hktb keda "appium --allow-insecure chromedriver_autodownload"
		//3shan a5ly appium y3ml auto locate ll chrome driver
		//w lazem a7ot setCapability("broswerName","Chrome")
		Properties properties = new Properties();
	    FileInputStream file_1=new FileInputStream(System.getProperty("user.dir") + "src//main//java//resources//DriverData.properties");
	    properties.load(file_1);
        String IpAddress = properties.getProperty("ipAddress");
        String DeviceName = properties.getProperty("AndroidDeviceName");
        String BrowserName = properties.getProperty("browser");
        int Port = Integer.parseInt( properties.getProperty("port") );
		service=startAppiumServer(IpAddress,Port);
		UiAutomator2Options options=new UiAutomator2Options();
	    options.setDeviceName(DeviceName);	  
	    options.setCapability("browserName", BrowserName); //LAZEEEEEEM ADEFHA
		driver=new AndroidDriver(service.getUrl(), options);
		Elements.SetDriver(driver);
		Buttons.SetDriver(driver);
		CheckBox.SetDriver(driver);
		DropMenu.SetDriver(driver);
		FormField.SetDriver(driver);
		Toast.SetDriver(driver);
		driver.get("https://www.facebook.com"); //dh LINK 2ly ana 3ayzo yro7o
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void EndSession()
	{
		driver.quit();
		service.stop();
	}
}
