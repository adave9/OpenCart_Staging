package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import base.BaseClass;
import page.HomePage;

import java.io.IOException;

public class HomePageTest extends BaseClass{
	
	public HomePage hp;
	
	public HomePageTest() throws IOException {
		hp = new HomePage();
	}

	  @Test(priority = 1)
	  public void titleTest() {
		  String title = hp.homepage_title();
		  String expetedTitle = "Your Store";
		  soft_assert.assertEquals(title, expetedTitle);
	  }
	  
	  @Test(priority = 2)
	  public void logoTest() {
		  boolean logo = hp.homepage_logo();
		  boolean logoExpected = true;
		  soft_assert.assertEquals(logo, logoExpected);
	  }

	  @AfterTest
	  public void tearDown() {
		  driver.quit();
	  }
}
