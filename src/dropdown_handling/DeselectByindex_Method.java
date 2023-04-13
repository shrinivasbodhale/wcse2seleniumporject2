package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByindex_Method {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///F:/HTML/multiselectdropdown_menu.html");
		 
		WebElement dropdownelement= driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdownelement);
		
		// SELECT MULTIPLE OPTION FROM DYNAMIC DROPDOWN
		for(int i=0; i<5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}

		
		//DESELECT ALL THE OPTION FROM DYNAMIC DROPDOWN
		for(int i=0; i<5; i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(3000);
		}
	}

}
