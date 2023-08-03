package WebDriver_castings_2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAllCookieInSelenium {

	WebDriver driver;

	@Test
	public void deleteAllCookieInSelenium() {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");

		WebDriverManager.firefoxdriver().setup();

		// create chrome object
		driver = new FirefoxDriver();
		driver.navigate().to("http://flipkart.com/");
		driver.manage().deleteAllCookies();
		// After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie allcookies : cookiesList) {
			System.out.println(allcookies);
		}
	}
}