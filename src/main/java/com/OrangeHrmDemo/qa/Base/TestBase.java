package com.OrangeHrmDemo.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.OrangeHrmDemo.qa.Utils.TestUtil;

public class TestBase {

public static WebDriver driver;
public static Properties prop;

public TestBase() {
	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\bapparayar\\git\\OrangeHrmDemoHybridFramework\\src\\main\\java\\com\\OrangeHrmDemo\\qa\\Config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}


public static void intialization(){
	  
	 String browsername = prop.getProperty("browser");
	 
	 if(browsername.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bapparayar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe" );
		 driver = new ChromeDriver();
	 }else if(browsername.equals("FF")) {
		 System.setProperty("webdriver.gecko.driver", "");
		 driver = new FirefoxDriver();
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_Load_Timeout));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_wait));
	 
	 driver.get(prop.getProperty("url"));
	  
}



}
