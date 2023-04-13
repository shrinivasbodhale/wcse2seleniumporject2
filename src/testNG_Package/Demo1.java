package testNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void f()
  {
	  int a=6;
	  int b=0;
	  int res =a/b;
	  Reporter.log("i'm  coming to bombay on monday",res,true);
	  
  }
  @Test
  public void w()
  {
	  Reporter.log("hi hello ",true);
  }
  
}
