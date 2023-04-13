package framePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIw-LervmX_gIVmX0rCh2LbQwVEAAYASAAEgL_BPD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

		//driver.switchTo().frame(6);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//iframe[@id='fc_widget']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='name']")).sendKeys("rahul");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("abcd123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9527124500");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		Thread.sleep(3000);
		WebElement reply = driver.findElement(By.xpath("//div[@placeholder='Reply here...']"));
		reply.sendKeys("yes u can");
		
	}

}
