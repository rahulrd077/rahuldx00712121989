package com.Scneider.Xyphias.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Scneider.Xyphias.testUtil.UtilDotNew;

public class TestBaseDotNew {
	
	public static Properties propobj1;
	
	public static WebDriver driver;
	
	public TestBaseDotNew() {
		
		try {
			
			FileInputStream file = new FileInputStream("D:\\Eclipse Workspace\\Xyphias-webappNew\\"
					+ ""
					+ "src\\main\\java\\com\\Scneider\\Xyphias\\properties\\objectrepository.properties");
			
			propobj1 = new Properties();
			
			propobj1.load(file);
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void InitializeDotNew() {
		
		String BrowserName = propobj1.getProperty("BROWSER");
		
		if(BrowserName.equals("chromeBrowser")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver 76\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		}
		
		driver.get(propobj1.getProperty("URL"));
		
		//driver.manage().timeouts().implicitlyWait(UtilDotNew.IMPLICIT_WAIT_SECONDS, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(UtilDotNew.PAGE_LOAD_TIMEOUT_SECONDS, TimeUnit.SECONDS);
		
	}
                   
}
