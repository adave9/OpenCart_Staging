package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath = "//div[@id='logo']")
	WebElement logo;
	
	public HomePage() throws IOException {
		initialization();
		PageFactory.initElements(driver, this);
	}
	
	public String homepage_title(){
		String homepagetitle = driver.getTitle();
		return homepagetitle;
	}
	
	public boolean homepage_logo(){
		boolean flaglogo = logo.isDisplayed();
		return flaglogo;
	}
}
