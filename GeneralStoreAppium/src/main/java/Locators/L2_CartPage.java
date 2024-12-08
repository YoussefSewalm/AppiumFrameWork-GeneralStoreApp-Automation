package Locators;

import org.openqa.selenium.By;

public class L2_CartPage {

	//Text
	public static By CartPageVerifyText=By.xpath("//android.widget.TextView[@text='Cart']");
	public static By ActualTotalPriceInCartText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']");
	//CheckBox
	public static By SendMeEmailsOnDiscountCheckBox=By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']");
	//Buttons
	public static By VisitWebsiteToCompletePurchaseButton=By.xpath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnProceed']");
	//Utility
	public static By ProductPricesInCartText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']");
}
