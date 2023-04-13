package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Shrinivas {
  @Test
  public void tenth() 
  {
	 Reporter.log("got 68 percent in 10th class", true);
	 
  }
  
  @Test
  public void diploma()
  {
	  Reporter.log("got 77 percent in diploma ",true);
  }
  
  @Test
  public void engineering()
  {
	  Reporter.log("got 75 percent in diploma ",true);
  }
}
