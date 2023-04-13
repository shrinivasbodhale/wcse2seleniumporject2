package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByUsing_Axes_P1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/s?k=mouse&crid=3GXWWSH0010Z8&sprefix=mouse%2Caps%2C439&ref=nb_sb_noss_1");

		WebElement brands = driver.findElement(By.xpath("//span[.='Logitech']/ancestor::span[@class='a-list-item']"));
		brands.click();
		Thread.sleep(3000);
		WebElement PcMouseFeature = driver.findElement(By.xpath("//span[.='Notebook']/ancestor::span[@class='a-list-item']"));
		PcMouseFeature.click();
		Thread.sleep(3000);
		WebElement mousematerial = driver.findElement(By.xpath("//span[.='Metal']/ancestor::span[@class='a-list-item']"));
		mousematerial.click();
		Thread.sleep(6000);

		driver.quit();
	}

}
