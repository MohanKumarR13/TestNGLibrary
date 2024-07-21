package testng.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	// Constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(name = "username")
	WebElement text_username;

	@FindBy(name = "password")
	WebElement text_password;

	@FindBy(xpath = "//*[normalize-space()='Login']")
	WebElement btn_login;

	@FindBy(tagName = "a")
	List<WebElement> links;

	// Action Methods
	public void setUserName(String user) {
		text_username.sendKeys(user);
	}

	public void setPassword(String pwd) {
		text_password.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_login.click();
	}

	public int sizeOfLinks() {
		return links.size();
	}

}
