package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag 
{
	 @Test
	  public void login() 
	  {
		  Reporter.log("Logged in",true);
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void createUser()
	  {
		  Reporter.log("User created ", true);
	  }
	  
	  @Test(dependsOnMethods = "createUser")
	  public void logOut()
	  {
		  Reporter.log("Logged Out",true);
	  }

}
