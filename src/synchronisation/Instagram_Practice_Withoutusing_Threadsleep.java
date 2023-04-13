package synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Practice_Withoutusing_Threadsleep {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com");
		   
		  
		   driver.findElement(By.name("username")).sendKeys("qwert");
		   driver.findElement(By.name("password")).sendKeys("asdfgh");
		   driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
