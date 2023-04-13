package questionsPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HowToCloseOnlyChildBrowserOrWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");

		String parenthandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		Set<String> allhandle = driver.getWindowHandles();

		for (String wh : allhandle)
		{
			if (!allhandle.equals(wh)) 
			{
				driver.switchTo().window(wh).close();
			}
			else 
			{

			}
		}
	}

}
