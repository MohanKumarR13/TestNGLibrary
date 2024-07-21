package testng.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By text_username_loc = By.name("username");
	By text_password_loc = By.name("password");
	By btn_login_loc = By.xpath("//*[normalize-space()='Login']");

	// Action Methods
	public void setUserName(String user) {
		driver.findElement(text_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd) {
		driver.findElement(text_password_loc).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}

}
