package popupHandling_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///F:/HTML/alertPopup1.html");

		Thread.sleep(3000);
		// Generate alert popup
		driver.findElement(By.xpath("//button[.='Click me!']")).click();

		// Switch control to the popup
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();

		// Accept the popup
		//Thread.sleep(3000);
		//alert.accept();
		
		// print the text of the alert popup
        Thread.sleep(3000);
	    System.out.println(alert.getText());


		// Dismiss the alert popup
		Thread.sleep(3000);
		alert.dismiss();

		
		// Send the characters to alert popup

		//alert.sendKeys("shrinivas");

	}

}
