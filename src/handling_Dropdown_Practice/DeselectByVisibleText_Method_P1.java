package handling_Dropdown_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText_Method_P1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(2000);

		WebElement dropdownelement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select select = new Select(dropdownelement);
		Thread.sleep(2000);
	
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Volvo");
		
		
		Thread.sleep(5000);
		select.deselectByVisibleText("Audi");
		select.deselectByVisibleText("Swift");
		select.deselectByVisibleText("Hyundai");
		select.deselectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
