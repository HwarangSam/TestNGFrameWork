package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.pages.NationalityPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NationalityTestCase {

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() {
		LoginPageElements loginPageObject = new LoginPageElements();
		NationalityPageElements national = new NationalityPageElements();
		loginPageObject.username.sendKeys(ConfigsReader.getProperty("validUserName"));
		loginPageObject.password.sendKeys(ConfigsReader.getProperty("validPassWord"));
		loginPageObject.loginBtn.click();
		
		national.admin.click();
		national.natBtn.click();
		national.addBtn.click();
		national.nameBtn.sendKeys("Sam Town", Keys.ENTER);
		
		//to list out all 
		for (WebElement eachCountry : national.nationalityList) {
			System.out.println(eachCountry.getText());
		}
		
//		if(Driver.getDriver().findElement(By.xpath("//a[text()='Sam_Town1']")).isDisplayed()) {
//			System.out.println("bet");
//		}
		
	}
}
