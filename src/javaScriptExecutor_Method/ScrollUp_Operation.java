package javaScriptExecutor_Method;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUp_Operation {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");

		Thread.sleep(3000);
		
		// Explicit Type Casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// scroll Down
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		
		// Scroll Down 
		jse.executeScript("window.scrollBy(0,-500)");
	}

}
