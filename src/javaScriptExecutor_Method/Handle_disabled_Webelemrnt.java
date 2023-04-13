package javaScriptExecutor_Method;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_disabled_Webelemrnt {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///F:/HTML/disabled%20webelement.html");

		Thread.sleep(3000);
		
		// Explicit Type Casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('i1').value=('admin')");
	}

}
