package testNGPackage1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
  @Test
  public void f() 
  {
	  Reporter.log("method f will get executed ",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("@beforemethod  will get executed ",true);
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("@aftermethod will get executed ",true);
  }
  

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("@beforeclass will get executed ",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("@afterclass will get executed ",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("@beforetest will get executed ",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("@aftertest will get executed ",true);
  }
  
  @Test 
  public void shree()
  {
	  Reporter.log("shrinivas is silent Killer", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("@beforesuite will get executed ",true); 
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("@aftersuite will get executed ",true);
  }
  
  @Test
 public void kapil()
 {
	  Reporter.log("kapil is voilent killer", true);
 }

}
