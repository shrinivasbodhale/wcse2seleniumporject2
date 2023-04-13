package xpath_Locator_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Byusing_Independantanddependant_Method_P1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.msedge.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/search?q=lipistic&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		WebElement brand = driver.findElement(By.xpath("//div[.='Lakmé']/preceding-sibling::div[@class='_24_Dny']"));
		brand.click();
		Thread.sleep(4000) ;          
		List<WebElement> lipisticname = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		List<WebElement> lipisticPrice = driver.findElements(By.xpath("//a[@class='s1Q9rs']/ancestor::div[@class='_4ddWXP']/descendant::div[@class='_30jeq3']"));
		Thread.sleep(4000);
		for(int i=0; i<lipisticname.size(); i++)
		{
			        String option1 = lipisticname.get(i).getText();
			        
			        for(int j=i; j<=i; j++)
			        {
			        	String option2 = lipisticPrice.get(j).getText(); 
			        	
			        	Thread.sleep(5000);
			        	System.out.println(option1 + ":>>>>>" + option2);
			        	Thread.sleep(2000);
			        	
			        }
		}
	}

}
