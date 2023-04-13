package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///F:/HTML/menu_dropdown.html");
		 
		WebElement dropdownelwment = driver.findElement(By.name("menu"));
		
		
		Select sel = new Select(dropdownelwment);
		
		Thread.sleep(3000);
		sel.selectByValue("v10");
	}

}
