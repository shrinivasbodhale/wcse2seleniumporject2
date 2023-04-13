package testjnFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag 
{
  @Test(description = "This used to search fordatabase")  // use to describe the test cases
  public void search1() 
  {
	  Reporter.log("SQL search",true);
  }
  
  @Test(description = "This is used to search java information")
  public void search2()
  {
	  Reporter.log("java search",true);
  }
}
