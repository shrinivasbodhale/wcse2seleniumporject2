package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
  @Test(invocationCount = 4)
  public void ft() 
  {
	 Reporter.log("FTC executing",true); 
  }
}
