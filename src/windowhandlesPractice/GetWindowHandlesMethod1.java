package windowhandlesPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandlesMethod1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");

		String pwh = driver.getWindowHandle();
		System.out.println("the adress of parent window handle is :  " + pwh);
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		
		// For each loop
		for(String wh:allwh)
		{
			System.out.println("address of window handles : "+wh);
		}
		
		// for loop
		
		for(int i=0; i<allwh.size();i++)
		{
			System.out.println("address of all window handles : "+allwh);
		}

	}

}
