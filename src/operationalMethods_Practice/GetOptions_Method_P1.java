package operationalMethods_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method_P1 {

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
		
		List<WebElement> alloptions = selection.getOptions();  
		
		for(int i=0; i<alloptions.size(); i++)
		{
			String getoptions = alloptions.get(i).getText();
			System.out.println(getoptions);
		}
			
		Thread.sleep(5000);
		WebElement dropdownelement1 = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select selection1 = new Select(dropdownelement1);
		System.out.println(selection1.isMultiple());
		
		List<WebElement> alloptions1 = selection1.getOptions(); 
		for(int i=1; i<alloptions1.size(); i++)
		{
			String getalloptions1 = alloptions1.get(i).getText();
			System.out.println(getalloptions1);
		}
		
			
	}

}
