package questions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question4 {

	public static void main(String[] args) throws InterruptedException
	{
		
		// To close only child browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");

        String parentHandle = driver.getWindowHandle();
        
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
			else
			{
				
			}
		}
	}

}
