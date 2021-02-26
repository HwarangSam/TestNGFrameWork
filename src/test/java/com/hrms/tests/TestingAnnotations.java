package com.hrms.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingAnnotations {
//use testNG for more complex functions rather than JUnit like testing order
	// test case 1
		@Test
		public void testCase1() {
			System.out.println("in test case 1");
		}
		// test case 2
		@Test
		public void testCase2() {
			System.out.println("in test case 2");
		}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("in beforeMethod");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("in afterMethod");
		}
		@BeforeClass
		public void beforeClass() {
			System.out.println("in beforeClass");
		}
		@AfterClass
		public void afterClass() {
			System.out.println("in afterClass");
		}
		@BeforeTest
		public void beforeTest() {
			System.out.println("in beforeTest");
		}
		@AfterTest
		public void afterTest() {
			System.out.println("in afterTest");
		}
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("in beforeSuite");
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("in afterSuite");
		}
//		beforeSuite		//whole damn thing
//		in beforeTest	//whole test folder?
//		in beforeClass	//each class aka separate tests
//		in beforeMethod	//the actual test methods in the test
//		in test case 1
//		in afterMethod
//		in beforeMethod
//		in test case 2
//		in afterMethod
//		in afterClass
//		in afterTest
//		PASSED: testCase1
//		PASSED: testCase2
//
//		===============================================
//		    Default test
//		    Tests run: 2, Failures: 0, Skips: 0
//		===============================================
//
//		in afterSuite
}
