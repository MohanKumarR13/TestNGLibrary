package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	public static String exp_title = "OpenCart";
	public static String act_title = "OpenShop";

	@Test
	public void testTitle() {
		if (exp_title.equals(act_title)) {
			System.out.println("test passed");
			Assert.assertEquals(act_title, exp_title);
		} else {
			System.out.println("test failed");
		}

		if (exp_title.equals(act_title)) {
			System.out.println("test passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("test failed");
			Assert.assertTrue(false);

		}
	}
}
