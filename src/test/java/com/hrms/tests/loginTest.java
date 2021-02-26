package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	LoginPageElements loginPageObject; //new LoginPageElements(); page factory lets us omit this step

	@BeforeMethod
	public void setup() throws InterruptedException {
		//WebDriverManager.chromedriver().setup(); Driver Class lets us omit this step
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest1() {

		loginPageObject.username.sendKeys(ConfigsReader.getProperty("validUserName"));
		loginPageObject.password.sendKeys(ConfigsReader.getProperty("validPassWord"));
		loginPageObject.loginBtn.click();
		
		//verify that you are on a dashboard page by verifying if the "Subscribe" is there
	
		DashboardPageElements dashBoardObject = new DashboardPageElements();
		
		System.out.println(dashBoardObject.subscribeBtn.getAttribute("value"));
		
		Assert.assertEquals(dashBoardObject.subscribeBtn.getAttribute("value"), "Subscribe");
	}
}
