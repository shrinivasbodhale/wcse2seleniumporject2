package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_12_LaptopnameWithPrice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("laptop");
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		driver.findElement(By.xpath("//div[text()='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();

		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
		driver.findElement(By.xpath("//div[.='Windows 10' ]/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]")).click();
		driver.findElement(By.xpath("//div[.='HP' ]/preceding-sibling::div[@class='_24_Dny']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above' ]/preceding-sibling::div[@class='_24_Dny']"));
		// Thread.sleep(2000);

		List<WebElement> laptopname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> Laptopprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for (int i = 0; i < laptopname.size(); i++) 
		{
			String option1 = laptopname.get(i).getText();

			for (int j = i; j <= i; j++) 
			{
				String option2 = Laptopprice.get(j).getText();
				System.out.println(option1 + "=" + option2);
				Thread.sleep(2000);
			}
		}
	}

}
