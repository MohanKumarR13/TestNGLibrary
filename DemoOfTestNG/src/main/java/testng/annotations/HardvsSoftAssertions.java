package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	@Test
	public void hardAssertion() {
		System.out.println("testgin");
		System.out.println("testgin");
		Assert.assertEquals(1, 2);
		System.out.println("testing");
		System.out.println("testing");
	}
	
	@Test
	public void softAssertion() {
		System.out.println("testgin");
		System.out.println("testgin");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(1, 2);
		System.out.println("testing");
		System.out.println("testing");
		softAssert.assertAll();
	}
}
