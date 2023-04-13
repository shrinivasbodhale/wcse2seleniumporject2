package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Byusing_Containfunction_P1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your email id')]"));
		username.sendKeys("shrinivasbodhale9751@gmai.com");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		button.click();
	}

}
