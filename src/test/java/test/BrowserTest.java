package test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
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

	  @AfterMethod
	  public void afterClass() {
		  driver.close();
	  }
}
