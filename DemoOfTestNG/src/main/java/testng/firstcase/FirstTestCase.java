package testng.firstcase;

import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority = 1)
	public void openApp() {
		System.out.println("Open Application");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login to Application");
	}
	
	@Test(priority = 3)
	public void logOut() {
		System.out.println("Logout the Application");
	}
}
