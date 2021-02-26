package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class DashboardPageElements {

	
	@FindBy(id="Subscriber_link")
	public WebElement subscribeBtn;
	
	@FindBy(id="MP_link")
	public WebElement marketBtn;
	
	@FindBy(id="welcome")
	public WebElement welcome;
	
	public DashboardPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//not sure about this bit
	public void navigateToAddEmployee() {
	}
}
