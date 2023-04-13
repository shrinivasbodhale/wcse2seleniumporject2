package Operational_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElemnet_Method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///F:/HTML/multiselectdropdown_menu.html");	
		WebElement dropdownelement = driver.findElement(By.id("i1"));
		
		Select selectionoption = new Select(dropdownelement);

		WebElement option = selectionoption.getWrappedElement();		
		System.out.println(option.getText());
	}

}
