package testNGAnnotations;

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

public class ToUnderstandAnnotations {
  @BeforeTest
  public void beforeTestMethod()
  {
	  Reporter.log("This Is BeforeTest Method",true);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("This Is AfterMethod Method",true);
  }
  
  @BeforeSuite
  public void beforeSuiteMethod()
  {
	  Reporter.log("This Is BeforeSuite Method",true);
  }
  
  @AfterClass
  public void afterClassMethod()
  {
	  Reporter.log("This Is AfterClass Method",true);
  }
  
  @AfterSuite
  public void afterSuiteMethod()
  {
	  Reporter.log("This Is AfterSuite Method",true);
  }
  
  @Test
  public void test1()
  {
	  Reporter.log("This Is Testcase 1",true);
  }
  
  @AfterTest
  public void afterTestMethod()
  {
	  Reporter.log("This Is AfterTest Method",true);
  }
  
  @BeforeClass
  public void beforeClassMethod()
  {
	  Reporter.log("This Is BeforeClass Method",true);
  }
  
  @BeforeMethod
  public void beforeMethodMethod()
  {
	  Reporter.log("This Is BeforeMethod Method",true);
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("This Is Testcase 2",true);
  }
}
