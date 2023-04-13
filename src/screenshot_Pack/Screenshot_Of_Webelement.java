package screenshot_Pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshot_Of_Webelement {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   Thread.sleep(3000);
		   WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.selenium.dev/");
		   
		 WebElement seleniumIde = driver.findElement(By.xpath("//h4[.='Selenium IDE']/ancestor::div[@class='card-body']"));
		 File src = seleniumIde.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShots/ssofwebelement.png");
		 
		 Files.copy(src, dest);
	}

}
