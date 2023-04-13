package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage 
{
@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUserButton;
@FindBy(xpath="//input[@name='username']") private WebElement UsernameTB;
@FindBy(xpath="//input[@name='passwordText']") private WebElement PasswordTB;
@FindBy(xpath="//input[@name='passwordTextRetype']") private WebElement retypePasswordTB;
@FindBy(xpath="//input[@name='firstName']") private WebElement FirstNameTB ;
@FindBy(xpath="//input[@name='lastName']") private WebElement LastNameTB;
@FindBy(xpath="//input[@value='   Create User   ']") private WebElement CreateButton;
@FindBy(xpath="//input[@type='button' and @value='      Cancel      ']") private WebElement CanelButton;


// initialization

public UserPage(WebDriver driver) 
{
	PageFactory.initElements( driver, this);
}


     // updation (getters methods )
public WebElement getCreateNewUserButton() {
	return CreateNewUserButton;
}


public WebElement getUsernameTB() {
	return UsernameTB;
}


public WebElement getPasswordTB() {
	return PasswordTB;
}


public WebElement getRetypePasswordTB() {
	return retypePasswordTB;
}


public WebElement getFirstNameTB() {
	return FirstNameTB;
}


public WebElement getLastNameTB() {
	return LastNameTB;
}


public WebElement getCreateButton() {
	return CreateButton;
}


public WebElement getCanelButton() {
	return CanelButton;
}



// operational methods 
public void userCreate() 
{
	CreateNewUserButton.click();
	
}



public void FirstUser(String usn,String pass,String fn,String ln) throws InterruptedException
  {
	UsernameTB.sendKeys(usn);
	Thread.sleep(2000);
	PasswordTB.sendKeys(pass);
	Thread.sleep(2000);
	retypePasswordTB.sendKeys(pass);
	Thread.sleep(2000);
	FirstNameTB.sendKeys(fn);
	Thread.sleep(2000);
	LastNameTB.sendKeys(ln);
	Thread.sleep(2000);
	CreateButton.click();
	}



}


