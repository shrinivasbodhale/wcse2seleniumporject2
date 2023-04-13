package handle_Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_Notification_Popup_p1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--remote-allow-regions=*");
	      Thread.sleep(4000);
		  option.addArguments("--disable-notifications");
  
		 WebDriver driver = new ChromeDriver(option);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://in.puma.com/in/en");

	}

}
