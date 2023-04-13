package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Point Location = download.getLocation();
		int xaxis = Location.getX();
		int yaxis = Location.getY();
		
		System.out.println(xaxis+  "  "  +yaxis);
	}

}
