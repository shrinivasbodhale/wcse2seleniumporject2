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

public class Screenshot_Way2_1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		RemoteWebDriver rw = (RemoteWebDriver) driver;
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssway2_1.jpg");
		Files.copy(src, dest);
		Thread.sleep(5000);
		driver.quit();
	}

}
