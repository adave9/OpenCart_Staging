package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import util.Utilities;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public SoftAssert soft_assert = new SoftAssert();
	
	public BaseClass() throws IOException {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
		prop = new Properties();
		prop.load(ip);
	}

	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
