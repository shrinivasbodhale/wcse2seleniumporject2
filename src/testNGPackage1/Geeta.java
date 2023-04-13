package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Geeta 
{
	 @Test
	  public void tenth() 
	  {
		 Reporter.log("got 94 percent in 10th class", true);
		 
	  }
	  
	  @Test
	  public void diploma()
	  {
		  Reporter.log("got 93 percent in diploma ",true);
	  }
	  
	  @Test
	  public void engineering()
	  {
		  Reporter.log("got 95 percent in diploma ",true);
	  }
}
