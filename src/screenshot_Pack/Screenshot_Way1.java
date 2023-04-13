package screenshot_Pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_Way1 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// WAY1 CREATE A OBJECT OF BROWSER SPECIFIC CLASSES AND NO NEED TO UPCAST INTO WEBDRIVER(I)

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssway1.jpg");

		Files.copy(src, dest);

	}

}
