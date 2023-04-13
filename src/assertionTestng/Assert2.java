package assertionTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import methods_of_webelement.Sendkeys_Method;

public class Assert2 
{
	static WebDriver driver;

	@BeforeTest
	public void property()
	{
		System.setProperty("chromedriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void launchBrowser()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" http://laptop-vnj72ojb/login.do");
	}

	@Test
	public void login() throws InterruptedException 
	{

		String actualloginpageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualloginpageTitle, "loginPage");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		String actualHomepageTitle = driver.getTitle();
		// Assert.assertEquals(actualloginpageTitle, "I don't know");
		Assert.assertEquals(actualloginpageTitle, "actiTIME - Enter Time-Track");
		driver.findElement(By.className("logout")).click();
		Thread.sleep(2000);
		sa.assertAll();

	}

	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
