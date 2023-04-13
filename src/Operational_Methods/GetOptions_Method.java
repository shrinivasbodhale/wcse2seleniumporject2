package Operational_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///F:/HTML/menu_dropdown.html");
		 
		 WebElement dropdownelement = driver.findElement(By.id("i"));
		  Select selectionoption = new Select(dropdownelement);
		 System.out.println(selectionoption.isMultiple());
		 
		 List<WebElement> alloption = selectionoption.getOptions();
		 
		 for(int i=0; i<alloption.size(); i++)
		 {
			String option = alloption.get(i).getText();
			System.out.println(option);
		 }
		 
		 
		 
		 Thread.sleep(5000);
		 driver.navigate().to("file:///F:/HTML/multiselectdropdown_menu.html");
		WebElement dropdownelement1 = driver.findElement(By.id("i1"));
		
		Select selectionoption1 = new Select(dropdownelement1);
		System.out.println(selectionoption1.isMultiple());
		List<WebElement> alloption1 = selectionoption1.getOptions();
		
		for(int i=0; i<alloption1.size(); i++)
		{
			String option1 = alloption1.get(i).getText();
			System.out.println(option1);
		}
	}

}
