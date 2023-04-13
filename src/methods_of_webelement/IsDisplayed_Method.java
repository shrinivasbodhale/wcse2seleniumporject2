package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		
		boolean check = download.isDisplayed();
		
		//System.out.println(download.isDisplayed());
		
		System.out.println(check);
	}

}
