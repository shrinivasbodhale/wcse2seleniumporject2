package operationalMethods_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");

		WebElement dropdownelement = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select selection = new Select(dropdownelement);

		for (int i = 0; i <= 3; i++) 
		{
			selection.selectByIndex(i);
		}
		
		List<WebElement> alloptions = selection.getAllSelectedOptions();

		for (int i = 0; i <= alloptions.size(); i++) 
		{
			String getalloptions = alloptions.get(i).getText();
			System.out.println(getalloptions);

		}

		Thread.sleep(5000);
		driver.quit();
	}

}
