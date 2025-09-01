package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement button;
	
	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		
		user.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		button.click();
		
		driver.quit();
	}

}
