package com.hrms.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNg_dataProviderTest {

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{"Kanin"}, {"Park"}};
		}

	@Test(dataProvider = "data-provider")
		public void myTest(String val) {
			System.out.println("My Name : " + val);
		}
}
