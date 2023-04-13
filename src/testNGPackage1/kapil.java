package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kapil 
{
	 @Test
	  public void tenth() 
	  {
		 Reporter.log("got 72 percent in 10th class", true);
		 
	  }
	  
	  @Test
	  public void diploma()
	  {
		  int a=10;
		  int b=0;
		  int res = a/b;
		  Reporter.log("got 80 percent in diploma ",true);
	  }
	  
	  @Test
	  public void engineering()
	  {
		  Reporter.log("got 90 percent in diploma ",true);
	  }
}
