package testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skip");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed But Within Success Percentage");

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Start");

	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finish");

	}
}
