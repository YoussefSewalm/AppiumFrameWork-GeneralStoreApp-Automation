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
	//EL TOAST DH MSH BYTGAB MN AY SELECTOR l2no Gowa FRAME (IFRAME) w bl la2y lazm aktbo b 2edy ,, tb ezay??
	//al ma3loma 2ly m3ya en lazem lazem l Toast dh yb2a l tag bta3o android.widget.Toast w bl taly 3an tare2 l xpath ana a2dar 
	//a7dedo bs fe ma3loma tanya ana 3ayez ageb l text nafso b2a 3shan a verify 3al error message deh LAKEN 
	//l Toast dh malosh TEXT hwa leh NAME 3shan keda h3ml get attributeName w a verify 3leha
	//law 3ndy kaza Toast Message bl index 3ady b7ded ana 3ayez anhy wa7da fl xpath

	
}
