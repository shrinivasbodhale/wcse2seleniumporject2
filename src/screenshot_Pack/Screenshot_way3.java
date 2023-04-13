package screenshot_Pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot_way3 {

	public static void main(String[] args) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      
	      // WAY3 UPCAST THE BROWSER SPECIFIC CLASSES INTO REMOTEWEBDRIVER (CLASS)
	      
	      RemoteWebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      driver.get("https://www.cricbuzz.com/");
	      
	      File src = driver.getScreenshotAs(OutputType.FILE);
	      File dest = new File("./ScreenShots/ssway3.jpg");
	      
	      Files.copy(src, dest);
	}

}
