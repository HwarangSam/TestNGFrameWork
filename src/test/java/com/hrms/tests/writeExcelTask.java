package com.hrms.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class writeExcelTask {
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws IOException, InterruptedException {
		LoginPageElements loginPage = new LoginPageElements();
		String path = "OrangeXSS.xlsx";
		FileInputStream fs = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);

		Row row = sheet1.getRow(1);
		Cell userNameXSS = sheet1.getRow(1).getCell(0); //this or that
		String userName = userNameXSS.toString();
		Cell passWordXSS = row.getCell(1);
		String passWord = passWordXSS.toString();
		Cell firstNameXXS = row.getCell(2);
		String firstNameEntry = firstNameXXS.toString();
		Cell lastNameXSS = row.getCell(3);
		String lastNameEntry = lastNameXSS.toString();
		
		
		
		loginPage.username.sendKeys(userName);
		loginPage.password.sendKeys(passWord);
		loginPage.loginBtn.click();
		loginPage.adminBtn.click();
		loginPage.pimBtn.click(); 
		loginPage.addBtn.click();
		loginPage.firstName.sendKeys(firstNameEntry);
		loginPage.lastName.sendKeys(lastNameEntry);
		loginPage.saveBtn.click();

//		loginPage.username.sendKeys(userName);
//		Thread.sleep(1000);
//		loginPage.password.sendKeys(passWord);
//		loginPage.loginBtn.click();
	}
}