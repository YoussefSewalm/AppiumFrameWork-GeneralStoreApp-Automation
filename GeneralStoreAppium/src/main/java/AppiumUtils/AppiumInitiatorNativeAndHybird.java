package AppiumUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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

public class AppiumInitiatorNativeAndHybird extends StartAppiumServer {

	
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;


	public static void DriverInitiator() throws URISyntaxException, IOException
	{
		Properties properties = new Properties();
	    FileInputStream file_1=new FileInputStream(System.getProperty("user.dir") + "//src//main//java//resources//DriverData.properties");
	    properties.load(file_1);
        String IpAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress") : properties.getProperty("ipAddress");
        String DeviceName = System.getProperty("AndroidDeviceName") != null ? System.getProperty("AndroidDeviceName") : properties.getProperty("AndroidDeviceName");
        String AppPath = System.getProperty("AppPath") != null ? System.getProperty("AppPath") : properties.getProperty("AppPath");
        int Port = System.getProperty("port") != null ? Integer.parseInt( System.getProperty("port") ) : Integer.parseInt( properties.getProperty("port") ) ;

		//To Automate Opening Appium Server for (Hybird And Native Apps) From Eclipse	
        service=startAppiumServer(IpAddress,Port);
		UiAutomator2Options options=new UiAutomator2Options();
	    options.setDeviceName(DeviceName);
		options.setApp(AppPath);
		driver=new AndroidDriver(service.getUrl(), options);
		Elements.SetDriver(driver);
		Buttons.SetDriver(driver);
		CheckBox.SetDriver(driver);
		DropMenu.SetDriver(driver);
		FormField.SetDriver(driver);
		Toast.SetDriver(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//Function TO Drive JsonData
	public static List<HashMap<String,String>> getJsonData(String jsonFilePath) throws IOException
	{
        //First Step: Parsing Jsonfile Into String
        String JsonContent=FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
        
        //Second Step: Map The String File to List of HashMaps
        ObjectMapper objectmapper =new ObjectMapper();
        List<HashMap<String,String>> data = objectmapper.readValue( JsonContent ,
        new TypeReference<List<HashMap<String,String>>>(){} );
        
        //Return data
        return data;	
	}
	public AndroidDriver getDriver()
	{
		return driver;
	}

	public static void EndSession()
	{
		driver.quit();
		service.stop();
	}
}
