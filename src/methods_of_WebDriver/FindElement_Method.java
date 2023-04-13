package methods_of_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/CheckBox.html");
		 
		 WebElement automationChkBox = driver.findElement(By.id("i4"));
		 System.out.println(automationChkBox);
		 automationChkBox.click();
		 Thread.sleep(1000);
		 
		 driver.navigate().to("http://desktop-aigvo6j/login.do");
		 driver.manage().window().maximize();
		 WebElement usn = driver.findElement(By.name("username"));
		 usn.sendKeys("admin");
		 WebElement pass = driver.findElement(By.name("pwd"));
		 pass.sendKeys("manager");
		 
		 driver.findElement(By.id("loginButton")).click();
	}

}
