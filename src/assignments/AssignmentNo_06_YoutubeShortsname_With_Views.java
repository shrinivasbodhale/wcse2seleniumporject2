package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_06_YoutubeShortsname_With_Views {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("youtube shorts");
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(10);
		List<WebElement> YtShortsTitle = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']"));
		List<WebElement> YTShortsViews = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']/ancestor::a[@class='yt-simple-endpoint style-scope ytd-reel-item-renderer']/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		
		for(int i=0; i<YtShortsTitle.size(); i++)
		{
			String option1 = YtShortsTitle.get(i).getText();
			
			for(int j=i; j<=i; j++)
			{
				String option2 = YTShortsViews.get(j).getText();
				Thread.sleep(10);
				System.out.println(option1+  "=" + option2);
				Thread.sleep(2000);
			}
		}
	}

}
