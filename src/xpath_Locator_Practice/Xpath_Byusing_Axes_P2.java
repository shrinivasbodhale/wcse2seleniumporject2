package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Byusing_Axes_P2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/search?q=lipistic&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		WebElement brand = driver.findElement(By.xpath("//div[.='Lakmé']/preceding-sibling::div[@class='_24_Dny']"));
		brand.click();
		   
		Thread.sleep(4000);
		WebElement CustomerRatings = driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']"));
		CustomerRatings.click();
		  
		  Thread.sleep(3000);
		  WebElement offers = driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Special Price']"));
		  offers.click();
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("(//div[@class='_213eRC _2ssEMF'])[4]")).click();
		  WebElement discount = driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='50% or more']"));
		  discount.click();
		  
		  Thread.sleep(10000);
		  driver.quit();
		  
	}

}
