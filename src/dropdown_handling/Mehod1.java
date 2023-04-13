package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mehod1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///F:/HTML/multiselectdropdown_menu.html");
		 
		 WebElement dropdownelement = driver.findElement(By.name("menu"));
		 
         Select selectoption = new Select(dropdownelement);
         
         Thread.sleep(4000);
         
         selectoption.selectByIndex(8);
         
	}

}
