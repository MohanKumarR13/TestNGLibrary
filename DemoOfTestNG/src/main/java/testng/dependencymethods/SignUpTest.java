package testng.dependencymethods;

import org.testng.annotations.Test;

public class SignUpTest {
	@Test(priority = 1,groups = {"regression"})
	public void signUpByEmail() {
		System.out.println("SignUp By Email");
	}

	@Test(priority = 1,groups = {"regression"})
	public void signUpByFaceBook() {
		System.out.println("SignUp By FaceBook");
	}

	@Test(priority = 1,groups = {"regression"})
	public void signUpByTwitter() {
		System.out.println("SignUp By Twitter");
	}
}
