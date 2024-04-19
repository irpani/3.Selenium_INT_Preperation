package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoMouseOverAndClickOnLink {

	WebDriver driver;

	@Test
	public void enterText() {

		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		// Navigate to site
		driver.get("https://www.actitime.com/download");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		// WebElement features =
		// driver.findElement(By.xpath("//span[contains(text(),'Clients')]"));

		// Create Object of Action Class
		// Actions action = new Actions(driver);

		// Move to element for which you want mouse Over
		// action.moveToElement(features).build().perform();

		// Just sleep for 1 second to make sure mouse over is successful.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Click on link
		driver.findElement(By.linkText("Work Scope Management")).click();

	}
}
