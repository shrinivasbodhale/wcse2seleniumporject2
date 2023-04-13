package typesofTestNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearchClass1 extends BaseTest{
  @Test
  public void search1() 
  {
	  driver.switchTo().activeElement().sendKeys("bahubali the beginning ",Keys.ENTER);
  }
}
