package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_11_Pohaname_With_Price {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Poha");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement> PohaName = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		List<WebElement> PohaPrice = driver.findElements(By.xpath("//a[@class='s1Q9rs']/ancestor::div[@class='_4ddWXP']/descendant::div[@class='_30jeq3']"));
        
		
		for(int i=0;i<PohaName.size();i++)
		{
			String option1 = PohaName.get(i).getText();
			
			for(int j=i;j<=i;j++)
			{
				String option2 = PohaPrice.get(j).getText();
				System.out.println(option1+ "="  +option2);
				Thread.sleep(2000);
			}
		}
	}

}
