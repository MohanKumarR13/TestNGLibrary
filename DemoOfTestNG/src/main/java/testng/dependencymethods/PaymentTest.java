package testng.dependencymethods;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority = 1, groups = { "sanity", "regression" })
	public void paymentInRupees() {
		System.out.println("Payment in Rupees");
	}

	@Test(priority = 2, groups = { "sanity", "regression" })
	public void paymentInDollers() {
		System.out.println("Payment in Dollers");
	}

}
