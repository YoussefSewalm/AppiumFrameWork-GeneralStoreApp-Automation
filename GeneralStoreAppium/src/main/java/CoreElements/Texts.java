package CoreElements;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Texts extends Elements{

	public Texts(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public String GetText()
	{
		String Text=driver.findElement(elementLocator).getText();
		return Text;
	}
	public void VerifyCriticalTextExists(String ExpectedText)
	{
		Assert.assertTrue(driver.findElement(elementLocator).getText().contains(ExpectedText));
	}
	public void VerifyNonCriticalTextExists(String ExpectedText)
	{
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(driver.findElement(elementLocator).getText().contains(ExpectedText));
	}


}