package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_Options_from_DynamicDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///F:/HTML/multiselectdropdown_menu.html");
		 
		WebElement dropdownelement= driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdownelement);
		
		for(int i=0; i<6; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
	}

}
