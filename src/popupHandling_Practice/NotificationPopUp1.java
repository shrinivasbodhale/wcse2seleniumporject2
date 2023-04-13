package popupHandling_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationPopUp1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//Thread.sleep(5000);
		//co.addArguments("--disable-notifiactions");
		//WebDriver driver = new ChromeDriver(co);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.yatra.com/");

		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		Thread.sleep(4000);
		eo.addArguments("--disable-notifications");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
	  
	}

}
