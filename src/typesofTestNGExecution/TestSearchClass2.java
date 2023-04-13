package typesofTestNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearchClass2 extends BaseTest{
  @Test
  public void search2() 
  {
	  driver.switchTo().activeElement().sendKeys("maa tujhe salaam ", Keys.ENTER);
  }
}
