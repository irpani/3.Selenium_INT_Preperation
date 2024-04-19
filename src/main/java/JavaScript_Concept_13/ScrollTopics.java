package JavaScript_Concept_13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTopics {
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
	}

	@Test
	public void scrollPage() {
		// Set the path of the ChromeDriver executable
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// Launch Chrome browser
		// Scroll vertically by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		// Scroll vertically to an element

		// WebElement element = driver.findElement(By.id("element-id"));
		// js.executeScript("arguments[0].scrollIntoView();", element);
		// Scroll horizontally by pixel
		js.executeScript("window.scrollBy(500, 0)");
		// Perform further actions after scrolling
		// ...
		// Close the browser

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
