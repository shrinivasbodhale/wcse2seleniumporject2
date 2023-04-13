package keyword_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest implements IAutoConstant{
	static WebDriver driver;

	public void setUp() throws IOException 
	{

		// open the browser

		Flib flib = new Flib();

		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if (browservalue.equals("chrome")) 
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		
		else if (browservalue.equals("edge")) 
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--remote-allow-origins=*");
			 driver = new EdgeDriver(eo);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else 
		{
			System.out.println("invalid browser");
		}

	}
      
	
	public void tearDown()
	{
		driver.quit();
	}
}
