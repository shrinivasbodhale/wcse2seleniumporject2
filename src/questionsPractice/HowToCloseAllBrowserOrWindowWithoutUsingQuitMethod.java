package questionsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HowToCloseAllBrowserOrWindowWithoutUsingQuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		Set<String> allwh = driver.getWindowHandles();

		for (String wh : allwh) 
		{
			driver.switchTo().window(wh).close();
			Thread.sleep(3000);
		}
	}

}
