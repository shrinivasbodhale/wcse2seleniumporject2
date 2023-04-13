package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Indrajeet
{
	 @Test
	  public void tenth() 
	  {
		 Reporter.log("got 56 percent in 10th class", true);
		 
	  }
	  
	  @Test
	  public void diploma()
	  {
		  Reporter.log("got 60 percent in diploma ",true);
	  }
	  
	  @Test
	  public void engineering()
	  {
		  Reporter.log("got 62 percent in diploma ",true);
	  }
}
