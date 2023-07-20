package webDriver_Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//FYI First 4 packages like 
/*WebDriver_Launch_1,
  WebDriver_casting_2,
  QuitvscloseAnd_Bornigracia_3,
  Naviation_4 methods focus on driver relate methods*/
// After that focus on Specific application launching url=>find webElements to  perform Actions...
public class WebDriver_Basics_1 {
	public static final String EXPECTED_TITLE = "Google";

	public static void main(String[] args) {

		// If u want to open the Google what comes in your mind Looking forBrowser to
		// open the Application/Site

		// ________ Manual Steps U ruturned as_________
		// Step 1:Open Chrome Browser
		// Step 2:Enter url
		// Step 3:get the Title --> Validation Point (Act Vs Exp...)
		// Step 4:Get the Url
		// Step 5:Finally close the Browser

		// Q:Can we opened Chrome Browser Directy?
		// A:No ,we need Selenium Server
		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Documents\\lib\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		// here in default Constructor chrome driver launch logic return

		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		String actURL = driver.getCurrentUrl();
		System.out.println("Current title of the Page is:" + title);

		// ______Validation/Checkpoint (or) Assertion ______mandatory As Automation
		// Engineer

		if (title.equals("Google")) {
			System.out.println("Title matched pass:" + title);
		} else {
			System.out.println("failed");
		}

		// ____Assertion_____

		/*
		 * Assert.assertEquals(title, EXPECTED_TITLE); driver.quit();
		 */
		driver.close();
		// Practice multiple sites Validations

	}

}
