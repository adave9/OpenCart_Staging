package test;

import org.testng.annotations.Test;

import base.BaseClass;
import page.HomePage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class HomePageTest extends BaseClass{
	
	public HomePage hp;
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

  @BeforeClass
  public void beforeClass() throws IOException {
  }

	  @Test
	  public void titleTest() {
		  String title = hp.homepage_title();
		  String expetedTitle = "Your Store";
		  soft_assert.assertEquals(title, expetedTitle);
	  }
	  
	  @Test
	  public void logoTest() {
		  boolean logo = hp.homepage_logo();
		  boolean logoExpected = true;
		  soft_assert.assertEquals(logo, logoExpected);
	  }
	  
  @AfterTest
  public void afterClass() {
	  driver.quit();
  }

}
