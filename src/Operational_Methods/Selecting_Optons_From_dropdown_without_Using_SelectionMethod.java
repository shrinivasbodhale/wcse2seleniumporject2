package Operational_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Optons_From_dropdown_without_Using_SelectionMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///F:/HTML/menu_dropdown.html");
		
		
		WebElement dropdownelement = driver.findElement(By.id("i"));
		
		Select sel = new Select(dropdownelement);

		
		//without using selection method select the option from the dropdown
		
		List<WebElement> alloptions = sel.getOptions();
		for(WebElement options:alloptions)
		{
			
			if(options.getText().equals("poha"))
			{
				
				options.click();
				break;
			}
		}
	}

}
