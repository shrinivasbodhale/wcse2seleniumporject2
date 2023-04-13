package xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_UniqueAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("shrinivas@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("shree123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
