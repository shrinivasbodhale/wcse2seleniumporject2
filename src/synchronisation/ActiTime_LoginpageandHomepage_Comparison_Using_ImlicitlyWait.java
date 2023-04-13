package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_LoginpageandHomepage_Comparison_Using_ImlicitlyWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://laptop-vnj72ojb/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String LoginPageActualTitle = driver.getTitle();
		if(LoginPageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test case is passed Login Page verified");
		}
		
		else
	    {
			System.out.println("Test case is failed login page not verified ");
		}
		
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		String HomePageActualTitle = driver.getTitle();
		if(HomePageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test case is passed Home page is verified");
		}
		
		else
		{
			System.out.println("Test case is failed Home page is not verified");
		}

	}

}
