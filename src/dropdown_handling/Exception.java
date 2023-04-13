package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Exception {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///F:/HTML/menu_dropdown.html");

		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='menu']"));

		Select sel = new Select(dropdownelement);

		Thread.sleep(3000);
		sel.selectByVisibleText("vadapav");
		Thread.sleep(3000);
		sel.deselectByVisibleText("vadapav");

	}

}
