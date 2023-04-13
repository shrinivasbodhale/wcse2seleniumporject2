package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation 
{
	 @Test
	  public void f() 
	  {
		  Reporter.log("Test Case 1", true);
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  Reporter.log("before method" , true);
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  Reporter.log("after method", true);
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  Reporter.log("before method", true);
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		  Reporter.log("after class", true);
	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  Reporter.log("before Test",true );
	  }

	  @AfterTest
	  public void afterTest()
	  {
		  Reporter.log("after Test", true);
	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  Reporter.log("before Suite",true);
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		  Reporter.log("after suite" ,true);
	  }
	  
	  @Test
	  public void s1()
	  {
		  Reporter.log("Test Case2", true);
	  }
	  
	  @Test
	  public void s2()
	  {
		  Reporter.log("Test Case3", true);
	  }

}
