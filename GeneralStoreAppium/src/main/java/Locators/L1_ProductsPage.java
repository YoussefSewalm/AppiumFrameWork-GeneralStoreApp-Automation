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
	// ana hena 3andy moshklela fl add to cart ana 7aletha mn 5elal any grabt awl mrh w 3reft l scrolling byo2af l7ad fen 
	//bl zabt w mn 5lalha 3reft ageb l index bta3 l add to cart l kol item mn l 2 , bs dh msh 7al dynamic l2n
	//law grbto 3ala mobile shashto atwal shewia l index dh hyt3`yr,,,,w bl taly e7na hn7l l mawdo3 dh 
	//b shakl more dynamic aktar w dh mn 5lelal l ID bta3 kol product lma awslo bl scroll ha5od l ID dh
	//w mno hdos 3al add to cart 2ly 3ndo nafs l ID dh ayan kan hwa fen 3shan keda hn3ml func w msh hn7ded index 5als fl add to cart
	//w bl taly hnktafy b xpath wa7ed bs
	
	//Links
	public static By CartPageLink=By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']");
}
