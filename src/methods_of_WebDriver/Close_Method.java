package methods_of_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Method {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://www.amazon.com/");
	      
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      driver.close();
	}

}
