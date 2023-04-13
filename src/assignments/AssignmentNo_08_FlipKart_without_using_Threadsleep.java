package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_08_FlipKart_without_using_Threadsleep {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 driver.findElement(By.xpath("//span[text()='Cart']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Login']")).click();
		// Thread.sleep(2000);
		// driver.quit();

	}

}
