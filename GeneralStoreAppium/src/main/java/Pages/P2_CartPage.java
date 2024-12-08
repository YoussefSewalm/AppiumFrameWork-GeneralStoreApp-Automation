package Pages;
import CoreElements.*;
import static Locators.L2_CartPage.*;
public class P2_CartPage {
	
	//Texts
	public static Texts CartPageVerify=new Texts(CartPageVerifyText);
	public static Texts TotalPriceInCart=new Texts(ActualTotalPriceInCartText);
	//CheckBox
	public static CheckBox SendMeEmailsOnDiscount=new CheckBox(SendMeEmailsOnDiscountCheckBox);
	//Buttons
	public static Buttons VisitWebsiteToCompletePurchase=new Buttons(VisitWebsiteToCompletePurchaseButton);
	//Utility
	public static Utility ProductPricesInCart=new Utility(ProductPricesInCartText);
}
