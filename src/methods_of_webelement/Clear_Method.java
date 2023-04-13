package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://laptop-vnj72ojb/login.do");
		
		WebElement UsernameTextbox = driver.findElement(By.name("username"));
		UsernameTextbox.sendKeys("admin");

		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		PasswordTextBox.sendKeys("manager");
		
		Thread.sleep(5000);
		UsernameTextbox.clear();
		Thread.sleep(5000);
		PasswordTextBox.clear();
	}

}
