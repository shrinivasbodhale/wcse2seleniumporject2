package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_Textfunction_P1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-vnj72ojb/login.do");
		
		Thread.sleep(3000);
		WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
		usn.sendKeys("admin");
		
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys("manager");
		
		Thread.sleep(3000);
		WebElement lg = driver.findElement(By.xpath("//a[text()='Login']"));
		lg.click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
