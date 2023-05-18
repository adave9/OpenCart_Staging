package test;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.BaseClass;


public class BrowserTest extends BaseClass{

  public BrowserTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	  @Test(invocationCount = 5)
	  public void browserLaunchTest() {
		  initialization();
	  }

	  @AfterTest
	  public void tearDown() {
		  driver.quit();
	  }
}
