package testngExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestngClass2 extends BaseTest 
{
	 @Test
	  public void search2() {
		  
		  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
}
