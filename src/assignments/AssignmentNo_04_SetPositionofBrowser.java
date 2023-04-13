package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_04_SetPositionofBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// setSize of Browser
		Dimension targetSize = new Dimension(300,450);
		driver.manage().window().setSize(targetSize);
		// setPosition of Browser
		Thread.sleep(4000);
		Point targetPosition = new Point(350,350);
		driver.manage().window().setPosition(targetPosition);
	}

}
