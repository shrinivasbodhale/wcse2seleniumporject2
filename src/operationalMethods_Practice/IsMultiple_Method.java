package operationalMethods_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");

		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='SiteMap']"));
		Select selection = new Select(dropdownelement);
		selection.isMultiple();
		System.out.println(selection.isMultiple());

		Thread.sleep(2000);
		WebElement dropdownelement1 = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select selection1 = new Select(dropdownelement1);
		System.out.println(selection1.isMultiple());
		
		Thread.sleep(3000);
		driver.quit();

	}

}
