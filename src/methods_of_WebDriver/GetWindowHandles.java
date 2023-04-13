package methods_of_WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandles {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("This the add of parentwindow :"+parentHandle);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			System.out.println("This the add of all windows :"+wh);
		}
		
	}

}
