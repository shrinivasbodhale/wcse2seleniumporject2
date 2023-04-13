package typesofTestNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearchClass3 extends BaseTest
{
  @Test
  public void search3() 
  {
	  driver.switchTo().activeElement().sendKeys("diljale",Keys.ENTER);
  }
}
