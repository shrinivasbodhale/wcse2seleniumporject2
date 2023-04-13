package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution 
{
  @Test(groups = "FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("FTC1 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st1()
  {
	  Reporter.log("STC1 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("FTC1 is executed",true);
  }
  
  // -------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("FTC2 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st2()
  {
	  Reporter.log("STC2 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it2()
  {
	  Reporter.log("FTC2 is executed",true);
  }

  //-----------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("FTC3 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st3()
  {
	  Reporter.log("STC3 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it3()
  {
	  Reporter.log("FTC3 is executed",true);
  }

  //---------------------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft4() 
  {
	  Reporter.log("FTC4 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st4()
  {
	  Reporter.log("STC4 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it4()
  {
	  Reporter.log("FTC4 is executed",true);
  }

  //--------------------------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft5() 
  {
	  Reporter.log("FTC5 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st5()
  {
	  Reporter.log("STC5 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it5()
  {
	  Reporter.log("FTC5 is executed",true);
  }

  //-----------------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft6() 
  {
	  Reporter.log("FTC6 is executed", true);
  }
  
  @Test(groups = "SMOKE")
  public void st6()
  {
	  Reporter.log("STC6 is Executed", true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it6()
  {
	  Reporter.log("FTC6 is executed",true);
  }

  
 
}
