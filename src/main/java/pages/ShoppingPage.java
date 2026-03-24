package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingPage {

	WebDriver driver;
	
	public ShoppingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	By products  = By.xpath("//div[@class= 'card h-100']");
	//By addToCart = By.xpath("//button[@class='btn btn-info']");
	By checkout = By.cssSelector("a.btn.btn-primary");
	By  checkoutBtn1  =By.xpath("//button[@class='btn btn-success']");                
	By   country = By.id("country");
	By checkbox = By.id("checkbox2");
	By purchase = By.xpath("//input[@value ='Purchase']");
	// Action Method
	
	public void addproduct(String productName)
	{
		List<WebElement> productList = driver.findElements(products);
		
		for(WebElement p : productList)
		{
			String name = p.findElement(By.xpath(".//h4/a")).getText();
			if(name.equals(productName))
			{
				p.findElement(By.xpath(".//button")).click();
				break;
			}
		}
		
	}
	
	//Click checkout
	
	public void clickCheckout()
	{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			WebElement checkoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.btn-primary")));
			//WebElement checkoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",checkoutBtn);
			
			checkoutBtn.click();
			
		}
	
	public void clickCheckoutBtn1()
	{
		driver.findElement(checkoutBtn1).click();
	}
    

	public void selectCountry(String countryName) {
		// TODO Auto-generated method stub
		driver.findElement(country).sendKeys(countryName);
		
	}
	
	public void clickCheckBox() 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement label = wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		label.click();
		
	}
   
	public void clickPurchase()
	{
		driver.findElement(purchase).click();
	}
}
