package testng.annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@BeforeTest
	public void bt() {
		System.out.println("this is before test");
	}

	@Test(priority = 1 )
	public void abc() {
		System.out.println("this is abc from C1");
	}

}
