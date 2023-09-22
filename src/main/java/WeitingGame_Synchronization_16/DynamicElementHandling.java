package WeitingGame_Synchronization_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElementHandling {

	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		// Navigate to a webpage
		driver.get("https://example.com");
		// Wait for a dynamic element to be visible
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamic-element-id")));
		// Perform further actions on the dynamic element
		// ...
		// Close the browser
		driver.quit();
	}
}
