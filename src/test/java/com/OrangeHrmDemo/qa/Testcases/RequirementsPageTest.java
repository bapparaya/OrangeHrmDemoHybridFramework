package com.OrangeHrmDemo.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrmDemo.qa.Base.TestBase;
import com.OrangeHrmDemo.qa.Pages.Dashboard;
import com.OrangeHrmDemo.qa.Pages.LoginPage;
import com.OrangeHrmDemo.qa.Pages.Requirments;

public class RequirementsPageTest extends TestBase {
	LoginPage loginpage;
	Dashboard dashboard;
	Requirments requirements;

public RequirementsPageTest() {
	super();
	
}

@BeforeMethod
public void setUp() {
	intialization();
	loginpage = new LoginPage();
	dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	requirements = dashboard.clickonrequirments();
}

@Test(priority=1)
public void requirementslabletest() {
	boolean reqlabel = requirements.validatereuirmentslable();
	Assert.assertTrue(reqlabel);
}

@Test (priority=2)
public void candidatelabeltest() {
	boolean canlabel = requirements.validatecandidatelabel();
	Assert.assertTrue(canlabel);
}

@Test(priority=3)
public void selectcheckboxtest() {
	boolean checkboxsel = requirements.selectsalrepreqcheckbox("Sales Representative");
	Assert.assertTrue(checkboxsel);
}

@AfterMethod
public void teardown() {
	driver.quit();
}



}
