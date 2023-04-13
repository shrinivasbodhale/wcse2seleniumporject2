package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("file:///F:/HTML/multiselectdropdown_menu.html");
		 
		WebElement dropdownelement = driver.findElement(By.name("menu"));
		
		
		Select sel = new Select(dropdownelement);
		
		// selecting the multiple options from dynamic dropdown by using selectbyvalue method
		Thread.sleep(3000);
		sel.selectByValue("v1");
		Thread.sleep(3000);
		sel.selectByValue("v3");
		Thread.sleep(3000);
		sel.selectByValue("v5");
		Thread.sleep(3000);
		sel.selectByValue("v7");
		Thread.sleep(3000);
		sel.selectByValue("v9");
		
		Thread.sleep(6000);
		
		// deselecting the multiple options from dynamic dropdown by using deselectbyvalue method
		
		sel.deselectByValue("v1");
		Thread.sleep(3000);
		sel.deselectByValue("v3");
		Thread.sleep(3000);
		sel.deselectByValue("v5");
		Thread.sleep(3000);
		sel.deselectByValue("v7");
		Thread.sleep(3000);
		sel.deselectByValue("v9");
	}

}
