package testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@BeforeTest
	public void bt() {
		System.out.println("this is before test");
	}

	@Test(priority = 1 )
	public void abc() {
		System.out.println("this is abc from C1");
	}
	@AfterTest
	public void at() {
		System.out.println("this is after test");
	}

	@Test(priority = 2 )
	public void xyz() {
		System.out.println("this is xyz from C2");
	}
	@BeforeSuite
	public void bs() {
		System.out.println("this is before suite");
	}

	@BeforeSuite
	public void as() {
		System.out.println("this is after suite");
	}

	@Test(priority = 3)
	public void pqr() {
		System.out.println("this is pqr from C3");
	}
}
