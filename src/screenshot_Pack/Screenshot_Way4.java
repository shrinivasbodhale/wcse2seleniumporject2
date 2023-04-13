package screenshot_Pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshot_Way4 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/geckodriver.exe");
		 ChromeOptions options = new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   Thread.sleep(3000);
		   WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.selenium.dev/");
		   
		   // WAY 4 CREATE A OBJECT OF EventFiringWebDriver(c)
		   Thread.sleep(3000);
		      EventFiringWebDriver evf = new EventFiringWebDriver(driver);
		      
		     File src = evf.getScreenshotAs(OutputType.FILE);
		     File dest = new File("./ScreenShots/ssway4.png");
		     
		     Files.copy(src, dest);
	}

}
