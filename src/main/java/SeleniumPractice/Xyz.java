package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xyz {
	public static final String EXPECTED_TITLE = "Account Login";
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@Test
	public void driverlaunch() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); // http(or)https is
																								// mandatory ,www
																								// --optional
		String actTitle = driver.getTitle();
		String actURL = driver.getCurrentUrl();
		System.out.println("Current title of the Page is:" + actTitle);

		if (actTitle.equals("Account Login")) {
			System.out.println("Title matched pass:" + actTitle);
		} else {
			System.out.println("failed");
		}

		Assert.assertEquals(actTitle, EXPECTED_TITLE);

	}

	@AfterTest
	public void tesrDown() {
		driver.quit();

	}

}