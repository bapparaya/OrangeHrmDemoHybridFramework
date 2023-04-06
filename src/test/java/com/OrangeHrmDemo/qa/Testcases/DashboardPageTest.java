/*
 * author:Bapparaya
 */
package com.OrangeHrmDemo.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmDemo.qa.Base.TestBase;
import com.OrangeHrmDemo.qa.Pages.Dashboard;
import com.OrangeHrmDemo.qa.Pages.Leave;
import com.OrangeHrmDemo.qa.Pages.LoginPage;
import com.OrangeHrmDemo.qa.Pages.MyInfo;
import com.OrangeHrmDemo.qa.Pages.Requirments;

public class DashboardPageTest extends TestBase {
	LoginPage loginpage;
	Dashboard dashboard;
	MyInfo myinfo;
	Leave leave;
	Requirments requirments;
	
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginpage = new LoginPage();
		dashboard =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void userlabelTest() {
		boolean userlogin= dashboard.validateuserlabel();
		Assert.assertTrue(userlogin);
	}
	
	@Test(priority=2)
	public void dashboardlabeltest() {
		boolean dashboardlabel = dashboard.validatedashboardlabel();
		Assert.assertTrue(dashboardlabel);
	}
	
	@Test(priority=3)
	public void myinfotest() {
		myinfo = dashboard.clickonmyinfo();
	}
	
	@Test(priority=4)
	public void leavetest() {
		leave= dashboard.clickonleave();
	}
	
	@Test(priority=5)
	public void requirmentstest() {
		requirments = dashboard.clickonrequirments();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	






}
