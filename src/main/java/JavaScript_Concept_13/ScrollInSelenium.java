package JavaScript_Concept_13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollInSelenium {

	@Test
	public void scrollInSelenium() throws InterruptedException {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver");
		// create driver object
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");

		// it will go till the end vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(3000);
		// it will come up vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);

		// it will go till the pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);

		// it will come back till the pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1500)");
		driver.quit();
		/*
		 * Thread.sleep(3000);
		 * 
		 * // it will go down till the object specified. ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);",
		 * driver.findElement(By.xpath("//a[contains(text(),'Find')]")));
		 */

	}
}
