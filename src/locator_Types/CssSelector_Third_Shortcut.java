package locator_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Third_Shortcut {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("input[aria-label*=' number, username,']")).sendKeys("shree@gmail.com");
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("input[aria-label*='asswo']")).sendKeys("sredd123");
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("button[class*=' _acap _acas ']")).click();
		Thread.sleep(5000);	
		driver.quit();
	}

}
