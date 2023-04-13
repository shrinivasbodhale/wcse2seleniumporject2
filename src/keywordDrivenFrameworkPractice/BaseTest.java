package keywordDrivenFrameworkPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import keyword_Driven_Framework.Flib;

public class BaseTest implements IAutoConstant 
{
	static WebDriver driver;

	Flib flib = new Flib();

	public void setup() throws IOException 
	{
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if (browservalue.equals("chrome")) 
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}

		else if (browservalue.equals("edge")) 
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		} 
		else 
		{
			System.out.println("enter the correct browser value ");
		}

	}

	public void tearDown() 
	{
		driver.quit();
	}
}
