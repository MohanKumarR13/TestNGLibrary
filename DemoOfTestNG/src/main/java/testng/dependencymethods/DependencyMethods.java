package testng.dependencymethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	@Test(priority = 1)
	public void openApp() {
		Assert.assertTrue(true);

	}

	@Test(priority = 2,dependsOnGroups = {"openApp"})
	public void login() {
		Assert.assertTrue(true);

	}

	@Test(priority = 3,dependsOnGroups = {"login"})
	public void search() {
		Assert.assertTrue(false);
	}

	@Test(priority = 4,dependsOnGroups = {"login","search"})
	public void advsearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 5,dependsOnGroups = {"login"})
	public void logout() {
		Assert.assertTrue(true);
	}
}
