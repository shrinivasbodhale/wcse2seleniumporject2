package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime_LoginpageandHomepage_Comparison_using_ExplicitlyWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://laptop-vnj72ojb/login.do");
		 

		 // explicitly wait
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		 
		 System.out.println("test case is passed login page title is verified");
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		 wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		 
		 System.out.println("Test case is passed HOMEPAGE Is verified");
		 
	}

}
