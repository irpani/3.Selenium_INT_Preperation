package WeitingGame_Synchronization_16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_Concept_1 {

	// Implicit_wait 4 Drawbacks:- Implicitwait() -> is a method() ;
	// Explicit_wait is a Class{}
	// ------------------------
	/*
	 * 1. 2. 3. 4.
	 */
	// (1).Implicit wait is a Global_wait It is applicable to ALL WebElements
	// (2).Implicit wait is Poor wait It is appliable for only webElements not
	// applicable
	// for webElements like title,url ,alert....
	// (3).
	// (4).

	public static void main(String[] args) {
		// invoke and launch chrome
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.ebay.com/"); // enter url

		driver.manage().window().maximize(); // maximise window
		driver.manage().deleteAllCookies(); // deleting cookies

		// dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // give max time of 30 secs to load the page
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // give max time of 15 secs for all elments to
																			// be visble on the page
	}
}
