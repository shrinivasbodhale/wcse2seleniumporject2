package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Flag3 {
  @Test(priority = 1)
  public void login() 
  {
	  Reporter.log("Loggied in",true);
  }
  
  @Test(priority = 2)
  public void createUser()
  {
	  Reporter.log("User created ", true);
  }
  
  @Test(priority = 3)
  public void logOut()
  {
	  Reporter.log("Logged Out",true);
  }
}
