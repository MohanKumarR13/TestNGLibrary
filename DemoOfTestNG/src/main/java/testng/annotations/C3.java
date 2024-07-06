package testng.annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@BeforeSuite
	public void bs() {
		System.out.println("this is before suite");
	}

	@BeforeSuite
	public void as() {
		System.out.println("this is after suite");
	}

	@Test(priority = 1)
	public void pqr() {
		System.out.println("this is pqr from C3");
	}

}
