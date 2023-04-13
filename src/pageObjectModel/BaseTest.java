package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest implements IAutoConstant

{
	static WebDriver driver;

	public void setUp() throws IOException 
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if (browservalue.equalsIgnoreCase("chrome")) 
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		} 
		else if (browservalue.equalsIgnoreCase("Edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}

		else 
		{
			System.out.println("enter valid browservalue");
		}
		
	}

	public void tearDown() 
	{
		driver.quit();
	}
}
