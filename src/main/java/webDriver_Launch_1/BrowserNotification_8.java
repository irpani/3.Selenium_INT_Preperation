package webDriver_Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotification_8 {
	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();
		// Disable browser notifications
		options.addArguments("--disable-notifications");
		// Launch Chrome browser with options
		WebDriver driver = new ChromeDriver(options);
		// Perform actions after disabling notifications
		// ...
		// Close the browser
		driver.quit();
	}
}
