package com.hrms.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on test Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
	}
}