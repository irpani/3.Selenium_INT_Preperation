package WebDriver_castings_2;

import java.text.ParseException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCookiesInSelenium {
	WebDriver driver;

	@Test
	public void enterText() throws InterruptedException, ParseException {

		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();

		// create chrome object
		driver = new FirefoxDriver();
		// navigate to site
		driver.get("https://www.flipkart.com/");

		// An implicit wait tells WebDriver to poll the DOM for a certain amount of time
		// when trying to find an element
		// or elements if they are not immediately available.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		// to add cookie need to create object of Cookie class

		Cookie cookie = new Cookie("customeCookie", "12345");
		driver.manage().addCookie(cookie);

		// it will get all cookie of web page
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cook : cookies) {
			System.out.println(cook);
		}
	}
}
