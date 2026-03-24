package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	By username = By.id("username");
	By password =By.xpath("//input[@id = 'password']");
	By radio = By.xpath("//input[@name ='radio']");
	By dropDown = By.xpath("//select[@class = 'form-control']");
	By checkBox = By.xpath("//input[@type = 'checkbox']");
	By signin = By.xpath("//input[@type = 'submit']");

	
	//Action methods
	
	public void enterUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pass )
	{
	
		driver.findElement(password).sendKeys(pass);
     }
	public void radioButton() {

		driver.findElement(radio).click();
		}

	public void selectDropdown() {
	WebElement drop = driver.findElement(dropDown);
	Select s = new Select(drop);
	s.selectByVisibleText("Student");
	}
	public void checkBox()
	{
		driver.findElement(checkBox).click();
	}
	public void signIn() {
	driver.findElement(signin).click();
	}
	

}

	