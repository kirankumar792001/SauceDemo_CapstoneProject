package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import pages.AddToCart;
import pages.LoginPage;
import pages.LogoutPage;

public class LoginTest {
	
	WebDriver driver;
	
	LoginPage lp;
	LogoutPage lop;
	AddToCart atc;
	
	@Test
	public void login(){
		lp = new LoginPage(driver);
		lp.setUserName();
		lp.setPassword();
		lp.click();
	}
	
	@Test
	public void logout() throws Exception{
		lop = new LogoutPage(driver);
		lop.login();
		Thread.sleep(2000);
		lop.logout();
	}
	
	@Test
	public void add() {
		atc = new AddToCart(driver);
		atc.login();
		atc.addToCart();
	}
	
	@AfterClass
	public void quit() {
		if(driver!=null) driver.quit();
	}

}
