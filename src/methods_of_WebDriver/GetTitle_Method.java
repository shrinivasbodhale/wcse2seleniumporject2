package methods_of_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String sourcecodeofwebpage = driver.getPageSource();
		Thread.sleep(5000);
		System.out.println(sourcecodeofwebpage);
	}

}
