package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-vnj72ojb/login.do");

		WebElement UsernameTextbox = driver.findElement(By.name("username"));
		System.out.println(UsernameTextbox.getText());

		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		System.out.println(PasswordTextBox.getText());

		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		System.out.println(loginbutton.getText());

	}

}
