package handle_Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Handle_Notification_Popup 
{

	public static void main(String[] args) throws InterruptedException 
	{ 
		 
		 System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		 EdgeOptions options = new EdgeOptions();
		 
		  
		  Thread.sleep(4000);
		  options.addArguments("--disable-notifications");
		  
		 WebDriver driver = new EdgeDriver(options);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://www.irctc.co.in/nget/train-search");
         
         Thread.sleep(4000);
         driver.quit();
         
	}

}
