package actionclass_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.selenium.dev/downloads/");
		 
		 WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		 
		Actions act = new Actions(driver);
		
		// To right click on webelements
		
		act.contextClick(target).perform();

	}

}
