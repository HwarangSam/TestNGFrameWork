package com.hrms.tests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class OrangeHRM_LoginTests {
	
	//since we're using the class "Driver" which initializes WebDriver Driver we don't have to write it here

	@BeforeMethod (alwaysRun=true)
	public void beforeMethod() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//login using valid creds. user should be able to successfully login and see dashboard
	@Test(priority=1, groups={ "login" })
	public void test1() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
		.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
		.sendKeys(ConfigsReader.getProperty("validPassWord"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();
		
		String welcomeText = Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("welcomeTextId"))).toString();
		String expectedText = "Welcome Paul";
		AssertJUnit.assertEquals(expectedText, welcomeText);
		
		
	}
//login with valid username and invalid password, user should see "invalid credentials". Use new xml file
	@Test(priority=0, description = "logging in w/valid username and invalid password", groups={"login"})
	public void Login_validUsername_InvalidPassword() {
		
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
		.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
		.sendKeys(ConfigsReader.getProperty("invalidPassword"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();
		
		String invalidCredentialMessage = Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("spanMessageError"))).getText();
		String expectedCredentialMessage = "Invalid credentials";
		AssertJUnit.assertEquals(invalidCredentialMessage, expectedCredentialMessage);
	}
	@Test
	public void logReportedTesting() {
		Reporter.log("Testing This Reporter");
		Reporter.log("Everyone's getting a 100k job");
	}
}
