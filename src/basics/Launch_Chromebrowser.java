package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_Chromebrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   Thread.sleep(3000);
		   WebDriver driver = new ChromeDriver(options);
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
           driver.quit();
	}
}