package pageObjectModelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage 
{
    @FindBy(xpath="//input[@aria-label='Phone number, username, or email']") private WebElement usernameTB;
    @FindBy(xpath="//input[@aria-label='Password']") private WebElement passwordTB;
    @FindBy(xpath ="//div[.='Log in'])[1]") private WebElement loginbutton;
    
    
    // Initialization
	
	
	
	public LoginPage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}


	// Getters Methods 
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	// Operational Methods 
	
	public void validLogin(String validusn, String validpass)
	{
		usernameTB.sendKeys(validusn);
		passwordTB.sendKeys(validpass);
		loginbutton.click();
		 
		
	}
	
	public void invalidLogin(String invalidusn, String invalidpass) throws InterruptedException
	{
		usernameTB.sendKeys(invalidusn);
		passwordTB.sendKeys(invalidpass);
		loginbutton.click();
		 
		Thread.sleep(3000);
	    usernameTB.clear();
	}
     
}
