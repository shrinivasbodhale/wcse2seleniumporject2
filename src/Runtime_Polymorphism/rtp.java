package Runtime_Polymorphism;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class rtp {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	     
	      Scanner sc = new Scanner(System.in);
	      System.out.println("select the required browser");
	      
	      // ASK THE USER TO INPUT
	       String browservalue = sc.next();
	       if(browservalue.equals("chrome"))
	       {
	    	// LAUNCH CHROME BROWSER
	    	   
	    	 WebDriver  driver1 =new ChromeDriver();
	    	 
	    	 // Maximize the browser
	    	  driver.manage().window().maximize();
	       }
	       else if((browservalue.equals("edge")))
	       {
	    	   // LAUNCH EDGE BROWSER
	    	   WebDriver driver2=new EdgeDriver();
	    	   
	    	   // MAXIMIZE THE BROWSER
	    	   driver.manage().window().maximize();
	       }
	       else
	       {
	    	   System.out.println("select the valid browser");
	       }
	}

}
