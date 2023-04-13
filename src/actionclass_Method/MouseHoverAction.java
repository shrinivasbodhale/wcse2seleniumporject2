package actionclass_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		           ChromeOptions co = new ChromeOptions();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI2OHEs_O__QIVYJVLBR0p2wlCEAAYASAAEgLD4fD_BwE");

		  driver.findElement(By.id("denyBtn")).click();
		 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery')]"));
		 
		 // To perform Mouse Actions create Object of actions class
		 
		 Actions act = new Actions(driver);
		 
		 // To perform mousehover action
		 
		  //act.moveToElement(target).build().perform();
		 
		 act.moveToElement(target).perform();
		 
	      Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[.='Band']")).click();
	}

}
