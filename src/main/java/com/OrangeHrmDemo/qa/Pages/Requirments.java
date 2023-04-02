package com.OrangeHrmDemo.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrmDemo.qa.Base.TestBase;

public class Requirments extends TestBase {


@FindBy(xpath="//h6[text()='Recruitment']")
WebElement requirmentslabel;


//Sales Representative

@FindBy(xpath="//h5[text()='Candidates']")
WebElement candidate;

@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
WebElement addremts;

@FindBy(xpath="//input[@name='firstName']")
WebElement firstname;

@FindBy(xpath="//input[@name='lastName']")
WebElement lastname;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
WebElement emailreq;

@FindBy(xpath="//*[text()=' Save ']")
WebElement save;


public Requirments() {
	PageFactory.initElements(driver, this);
}

public boolean validatereuirmentslable() {
	return requirmentslabel.isDisplayed();
}

public boolean validatecandidatelabel() {
	return candidate.isDisplayed();
}

public boolean selectsalrepreqcheckbox(String role) {
	WebElement salrepcheck = driver.findElement(By.xpath("//div[contains(text(),'"+role+"')]//parent::div//preceding-sibling::div/div/div/label/span/i"));
	salrepcheck.click();
	return salrepcheck.isSelected();
}

public void addreqmts(String fn, String ln, String eml) {
	addremts.click();
	firstname.sendKeys(fn);
	lastname.sendKeys(ln);
	emailreq.sendKeys(eml);
	save.click();
	
}





}
