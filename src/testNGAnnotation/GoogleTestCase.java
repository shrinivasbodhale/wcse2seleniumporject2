package testNGAnnotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTestCase extends BaseTest
{
  @Test
  public void search1() throws InterruptedException 
  {
	  driver.switchTo().activeElement().sendKeys("Phool aur kaante",Keys.ENTER);
	  Thread.sleep(3000);
  }
  
  @Test
  public void search2() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("Dilwale",Keys.ENTER);
	  Thread.sleep(3000);

  }
  
  @Test
  public void search3() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("Diljale",Keys.ENTER);
	  Thread.sleep(3000);

  }
}
