package typesofTestNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTestClass4 extends BaseTest
{
  @Test
  public void search4() 
  {
	  driver.switchTo().activeElement().sendKeys("singham",Keys.ENTER);
  }
}
