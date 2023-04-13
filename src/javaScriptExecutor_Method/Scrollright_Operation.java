package javaScriptExecutor_Method;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollright_Operation {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");

		Thread.sleep(3000);

		// Perform Explicit Type Casting

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Scroll right
		jse.executeScript("window.scrollBy(5000,0)");
	}

}
