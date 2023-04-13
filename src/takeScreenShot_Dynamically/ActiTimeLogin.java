
package takeScreenShot_Dynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomeListener.class)

public class ActiTimeLogin extends BaseTest 
{
	@BeforeMethod
	public void setup()
	{
		intialization();
	}

	@Test
	public void loginPageMethod() 
	{
		String loginpage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpage, "loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();

	}

	@Test(dependsOnMethods = "loginPageMethod", alwaysRun = true)
	public void homePageMethod() throws InterruptedException 
	{
		String loginpage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpage, "loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// Homepage
		
		Thread.sleep(2000);

		WebElement saveleaveTime = driver.findElement(By.id("SubmitTTButton"));

		if (saveleaveTime.isDisplayed())
		{
			Assert.assertEquals(true, true);
		} 
		else 
		{
			sa.assertEquals(true, true);
		}

		WebElement logoutlink = driver.findElement(By.xpath("//a[text()='Logout']"));

		if (logoutlink.isDisplayed()) 
		{
			logoutlink.click();
		} 
		
		else 
		{
			System.out.println("will get excepetion");
		}

	}
	
	@AfterMethod
	public void tearDown()
	{
		close();
	}
}
