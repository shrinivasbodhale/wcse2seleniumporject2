package popupHandling_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmationPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///F:/HTML/confirmationPop-up.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		     Alert alert = driver.switchTo().alert();
		
		     Thread.sleep(3000);
		     System.out.println(alert.getText());
		     
		     Thread.sleep(3000);
		     alert.accept();
		     
		   //  Thread.sleep(3000);
		   //  alert.dismiss();
		     
		     Thread.sleep(6000);
		     driver.quit();
		     
		     
		     
		
	}

}
