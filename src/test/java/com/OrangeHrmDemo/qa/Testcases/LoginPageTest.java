package com.OrangeHrmDemo.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmDemo.qa.Base.TestBase;
import com.OrangeHrmDemo.qa.Pages.Dashboard;
import com.OrangeHrmDemo.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	Dashboard dashboard;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage= new LoginPage();
     }
	
	@Test(priority=1)
	public void loginpagetitletest() {
		String loginpagetitle = loginpage.validateloginpagetitle();
		Assert.assertEquals(loginpagetitle, "OrangeHRM", "title is not matched");
	}
	
	@Test(priority=2)
	public void orangehrmlogotest() {
		boolean validateoarangehrmlogo=loginpage.validateorangehrmlogo();
		Assert.assertTrue(validateoarangehrmlogo);
	}
	
	@Test(priority=3)
	public void loginpagetitlelogotest() {
		boolean loginpagetitle = loginpage.validateloginpagelogo();
		Assert.assertTrue(loginpagetitle);
	}
	
	@Test(priority=4)
	public void logintest() {
		dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
