package Locators;

import org.openqa.selenium.By;

public class L1_ProductsPage {

	//Texts
	public static By ProductsPageVerifyText=By.xpath("//android.widget.TextView[@text='Products']");
	public static By ProductNamesFromProductPagesText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']");
	public static By Product_1_NameFromProductsPageText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName' and contains(@text,'Nike Blazer Mid')]");
	public static By Product_1_PriceFromProductsPageText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice' and @text='$110.0']");
	public static By Product_2_NameFromProductsPageText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName' and @text=\"LeBron Soldier 12 '\"]");
	public static By Product_2_PriceFromProductsPageText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice' and @text='$130.0']");
	public static By CartItemsCounterText=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/counterText']");
	public static By AddToCartUtility=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']");
	//Buttons
	public static By AddToCartProductButton=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']");	
	//Links
	public static By CartPageLink=By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']");
}
