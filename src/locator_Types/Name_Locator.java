package locator_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML/checkbox.html");
		Thread.sleep(3000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n2")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n3")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
