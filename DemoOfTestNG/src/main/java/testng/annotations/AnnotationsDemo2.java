package testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Login =>@BeforeMethod
Search => @Test
Logout => @AfterMethod
Login
Advance Search => @Test
Logout*/
public class AnnotationsDemo2 {
	@BeforeClass
	public void login() {
		System.out.println("this is login");
	}

	@Test(priority = 1)
	public void search() {
		System.out.println("this is search");
	}

	@Test(priority = 2 )
	public void advsearch() {
		System.out.println("this is advance search");
	}

	@AfterClass
	public void logout() {
		System.out.println("this is logout");
	}

}
