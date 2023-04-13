package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctByVisibleText_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("file:///F:/HTML/multiselectdropdown_menu.html");
		  
		 WebElement dropdownelements = driver.findElement(By.xpath("//select[@name='menu']"));
		 
		Select selectionoptions = new Select(dropdownelements);
		
		// SELECTING THE MULTIPLE OPTION FROM DYNAMIC DROPDOWN BY USING SELECTBYVISIBLETEXT METHOD
		selectionoptions.selectByVisibleText("poha");
		Thread.sleep(3000);
		selectionoptions.selectByVisibleText("panipuri");
		Thread.sleep(3000);
		selectionoptions.selectByVisibleText("idli_dosa");
		Thread.sleep(3000);
		selectionoptions.selectByVisibleText("coffee");
		Thread.sleep(6000);
		
		// DESELECTING THE MULTIPLE OPTION FROM DYNAMIC DROPDOWN USING DESELECTBYVISIBLETEXT METHOD
		selectionoptions.deselectByVisibleText("poha");
		Thread.sleep(3000);
		selectionoptions.deselectByVisibleText("panipuri");
		Thread.sleep(3000);
		selectionoptions.deselectByVisibleText("idli_dosa");
		Thread.sleep(3000);
		selectionoptions.deselectByVisibleText("coffee");
	}

}
