package Pages;
import CoreElements.*;
import static Locators.L1_ProductsPage.*;

public class P1_ProductsPage {

	//Texts
	public static Texts ProductsPageVerify=new Texts(ProductsPageVerifyText);
	public static Texts ProductName=new Texts(ProductNamesFromProductPagesText);
	public static Texts Product_1_NameFromProductsPage=new Texts(Product_1_NameFromProductsPageText);
	public static Texts Product_1_PriceFromProductsPage=new Texts(Product_1_PriceFromProductsPageText);
	public static Texts Product_2_NameFromProductsPage=new Texts(Product_2_NameFromProductsPageText);
	public static Texts Product_2_PriceFromProductsPage=new Texts(Product_2_PriceFromProductsPageText);
	public static Texts CartItemsCounter=new Texts(CartItemsCounterText);
	public static Utility AddToCart=new Utility(AddToCartUtility);
	//Buttons
	public static Buttons AddToCartProduct=new Buttons(AddToCartProductButton);
	//Links
	public static Links CartPage=new Links(CartPageLink);
}
