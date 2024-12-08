package AppiumServer;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartAppiumServer {
	
	public static AppiumDriverLocalService service;
	
	public static AppiumDriverLocalService startAppiumServer(String IpAddress,int Port)
	{
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\giga\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress(IpAddress).usingPort(Port).build();
		service.start();
		return service;
	}
}
