package testjnFlag;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class AlwaysRunFlag {
  @Test
  public void login() 
  {
	 // int res =5/0;
	  Assert.fail();
	  Reporter.log("login method",true);
  }
  
  @Test(dependsOnMethods = "login", alwaysRun = true)
  public void createUser()
  {
	  
	  Reporter.log("user created",true);
  }
  
  @Test
  public void logout() 
  {
	  	  Reporter.log("logout method",true);
  }
}
