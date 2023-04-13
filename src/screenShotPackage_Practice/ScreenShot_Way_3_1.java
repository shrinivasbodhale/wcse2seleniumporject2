package screenShotPackage_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot_Way_3_1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://open.spotify.com/?");

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssway3_1.png");
		Files.copy(src, dest);
	}

}
