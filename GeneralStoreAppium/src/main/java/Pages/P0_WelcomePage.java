package Pages;
import CoreElements.*;
import static Locators.L0_WelcomePage.*;

public class P0_WelcomePage {

	//Text
	public static Texts GeneralStore=new Texts(HomePageVerifyText);
	//DropMenu
	public static DropMenu Nationality=new DropMenu(NationalityDropMenu);
	//FormField
	public static FormField NameForm=new FormField(NameFormField);
	//CheckBox
	public static CheckBox Male=new CheckBox(MaleCheckBox);
	public static CheckBox Female=new CheckBox(FemaleCheckBox);
	//Buttons
	public static Buttons LetsShop=new Buttons(LetsShopButton);
	//Toast Error Messages(Alert)
	public static Toast PleaseEnterYourName=new Toast(PleaseEnterYourNameToast);
}
