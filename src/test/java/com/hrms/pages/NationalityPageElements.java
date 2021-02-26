package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class NationalityPageElements {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement admin;
	
	@FindBy(id="menu_admin_nationality")
	public WebElement natBtn;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	
	@FindBy(id="nationality_name")
	public WebElement nameBtn;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="resultTable")
	public List<WebElement> nationalityList;
	
	public NationalityPageElements () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}
