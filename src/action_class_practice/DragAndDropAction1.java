package action_class_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		Actions action = new Actions(driver);
		action.dragAndDrop(src, target).perform();

		

		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

	
		action.dragAndDrop(src1, target1).perform();
	}
}
