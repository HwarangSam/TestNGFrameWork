package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class LoginPageElements {

	//Not using PageFactory, you have to extend CommonMethods or BaseClass
	//public WebElement username2=driver.findElement(By.id("txtUsername"));
	
	//Using PageFactory and @FindBy Annotation
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(name = "txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminBtn;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pimBtn;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	
	public LoginPageElements () {
		PageFactory.initElements(Driver.getDriver(), this); //if no Driver class then (WebDriver driver, this)
	}
	
	//if we would be keeping elements as private
	//then we will need to create public getters and setters 
	//so we can access page elements from test classes
	
	//setter
	public void sendUsername (String uid) {
		//sendText(username, uid);
	}
	//getter
	public WebElement getUsername() {
		return username;
	}
	public void login(String uid, String pwd) {
		
		
//		sendText(username, uid);
//		sendText(password, pwd);
//		click(loginBtn);
	}
}
