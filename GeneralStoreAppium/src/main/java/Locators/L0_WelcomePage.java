package Locators;

import org.openqa.selenium.By;

public class L0_WelcomePage {

	//Text
	public static By HomePageVerifyText=By.xpath("//android.widget.TextView[@text='General Store']");
	//DropMenu
	public static By NationalityDropMenu=By.className("android.widget.Spinner");	
	//FormField
	public static By NameFormField=By.className("android.widget.EditText");
	//CheckBox
	public static By MaleCheckBox=By.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']");
	public static By FemaleCheckBox=By.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioFemale']");
	//Button
	public static By LetsShopButton=By.xpath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']");
	//Toast Error Messages(Alert)
	public static By PleaseEnterYourNameToast=By.xpath("(//android.widget.Toast)[1]");	
}
