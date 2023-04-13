package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean Check = LoginButton.isEnabled();
		
		System.out.println(Check);
		
        System.out.println( LoginButton.isEnabled());
	}

}
