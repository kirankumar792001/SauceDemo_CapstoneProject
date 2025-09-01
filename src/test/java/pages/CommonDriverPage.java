package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class CommonDriverPage {
	public CommonDriverPage(WebDriver driver) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}

}
