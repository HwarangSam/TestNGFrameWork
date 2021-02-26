package com.hrms.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ListenersTestNG;

@Listeners(ListenersTestNG.class)
public class Testing_listenersSample {
	WebDriver driver;

	@Test // Success Test
	public void CloseBrowser() {
		Driver.getDriver().get("https://www.demoqa.com");
		Driver.getDriver().close();
		Reporter.log("Driver Closed After Testing");
	}

	@Test // Failed Test
	public void OpenBrowser() {

		driver.get("https://www.demoqa.com");
		String expectedTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = Driver.getDriver().getTitle();
		AssertJUnit.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}

	private int i = 1;

	@Test(successPercentage = 60, invocationCount = 3) // Failing Within Success
	public void AccountTest() {
		if (i < 2)
			AssertJUnit.assertEquals(i, i);
		i++;
	}

	@Test // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}
