package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends CommonDriverPage {
	
	@FindBy(id="user-name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement ibtn;
	
	@FindBy(className="btn_inventory")
	List<WebElement> list;

	public AddToCart(WebDriver driver) {
		super(driver);
	}
	
	public void login() {
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		ibtn.click();
	}
	
	public void addToCart() {
		for(WebElement e:list) {
			e.click();
		}
	}
}
