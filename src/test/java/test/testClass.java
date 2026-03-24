package test;

import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;
import pages.ShoppingPage;

public class testClass extends baseTest{
	
	@Test
	
	public void loginTest()
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName("rahulshettyacademy");
		lp.enterPassword("Learning@830$3mK2");
		lp.radioButton();
		lp.selectDropdown();
		lp.checkBox();
		lp.signIn();
		
		//driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		ShoppingPage sp = new ShoppingPage(driver);
		
		sp.addproduct("iphone X");
		sp.clickCheckout();
		sp.clickCheckoutBtn1();
		sp.selectCountry("India");
		//sp.clickCheckBox();
		sp.clickPurchase();
		
	}
	
}
