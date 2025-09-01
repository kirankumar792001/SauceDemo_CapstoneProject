package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends CommonDriverPage{
	
	@FindBy(id="user-name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement ibtn;

	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement menu;
	
//	@FindBy(xpath = "//a[contains(.,'Logout')]")
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement button;

	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void login() {
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		ibtn.click();
		menu.click();
	}
	
	public void logout(){
		button.click();
	}
}
