package testNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() 
  {
	 Reporter.log("sunday!!", true);
  }
  @Test
  public void m1()
  {
	  Reporter.log("sunday is funday",true);
  }
  
  @Test
  public void m2()
  {
	  Reporter.log("sunday is bad day",true);
  }
}
