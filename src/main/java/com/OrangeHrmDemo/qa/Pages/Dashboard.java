package com.OrangeHrmDemo.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrmDemo.qa.Base.TestBase;

public class Dashboard extends TestBase {


@FindBy(xpath="//p[text()='Paul Collings']")
WebElement loginlablel;

@FindBy(xpath="//h6[text()='Dashboard']")
WebElement dashboardlabel;

@FindBy(xpath="//span[text()='My Info']")
WebElement myinfoclick;

@FindBy(xpath="//span[text()='Leave']")
WebElement leaveclick;

@FindBy(xpath="//span[text()='Recruitment']")
WebElement requirmentsclick;


public Dashboard(){
	PageFactory.initElements(driver, this);
}

public boolean validateuserlabel() {
	return loginlablel.isDisplayed();
}

public boolean validatedashboardlabel() {
	return dashboardlabel.isDisplayed();
}

public MyInfo clickonmyinfo() {
	myinfoclick.click();
	
	return new MyInfo();
}

public Leave clickonleave() {
	leaveclick.click();
	
	return new Leave();
}

public Requirments clickonrequirments() {
	requirmentsclick.click();
	
	return new Requirments();
}










}
