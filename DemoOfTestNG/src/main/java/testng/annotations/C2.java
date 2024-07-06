package testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@AfterTest
	public void at() {
		System.out.println("this is after test");
	}

	@Test(priority = 1 )
	public void xyz() {
		System.out.println("this is xyz from C2");
	}

}
