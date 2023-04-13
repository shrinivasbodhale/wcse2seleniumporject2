package testngExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestngClass1 extends BaseTest
{
	 @Test
	  public void serach1() 
	 {
		  
		  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 }
}
