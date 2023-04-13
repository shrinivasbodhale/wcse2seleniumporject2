package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
  @Test(enabled = true)
  public void login() 
  {
	Reporter.log("Login Method", true);  
	  
  }
  
  @Test(enabled = true)
  public void logout()
  {
	  Reporter.log("Logout Method",true);
  }
  
  
  @Test(enabled = false)
  public void usercreate()
  {
	  Reporter.log("user created",true);
  }
  
}
