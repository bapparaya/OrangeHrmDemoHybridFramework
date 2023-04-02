package com.OrangeHrmDemo.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrmDemo.qa.Base.TestBase;

public class LoginPage extends TestBase {


@FindBy(name = "username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//button[@type='submit']")
WebElement loginbtn;

@FindBy(xpath="//*[@class='orangehrm-login-branding']")
WebElement orangehrmlogo;

@FindBy(xpath="//h5[text()='Login']")
WebElement logintitle;

public LoginPage() {
	PageFactory.initElements(driver, this);
}


public String validateloginpagetitle() {
	return driver.getTitle();
}

public boolean validateorangehrmlogo() {
	return orangehrmlogo.isDisplayed();
}

public boolean validateloginpagelogo() {
	return logintitle.isDisplayed();
}

public Dashboard login(String un, String psw) {
	username.sendKeys(un);
	password.sendKeys(psw);
	loginbtn.click();
	
	return new Dashboard();
}








}
