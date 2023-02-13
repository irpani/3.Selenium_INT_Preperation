package WeitingGame_Synchronization_16;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept_8 {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email = By.name("email");
		/*
		 * Wait<WebDriver> wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
		 * .pollingEvery(Duration.ofMillis(2)).ignoring(NoSuchElementException.class).
		 * // we can write here // multiple ignore cases
		 * withMessage("No Element Found");
		 */
		/*
		 * WebElement email_element =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(email));
		 * email_element.sendKeys("Naveen@gmail.com");
		 */
		/*
		 * WebElement email_element = waitForElementPresentUsingFluentWait(email, 10,
		 * 2); email_element.sendKeys("Naveen@gmail.com");
		 */

		WebElement email_element = waitForElementUsingWebDriverWait(email, 10, 2);
		email_element.sendKeys("Naveen@gmail.com");
	}

	/*
	 * public static WebElement waitForElementPresentUsingFluentWait(By Locator, int
	 * timeOut, int pollint) {
	 * 
	 * Wait<WebDriver> wait = new
	 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
	 * .pollingEvery(Duration.ofMillis(pollint)).ignoring(NoSuchElementException.
	 * class) .withMessage("No Element Found");
	 * 
	 * return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	 * 
	 * }
	 */

	public static WebElement waitForElementUsingWebDriverWait(By Locator, int timeOut, int pollint) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofMillis(pollint))
				.ignoring(NoSuchElementException.class).withMessage("No Element Found");

		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));

	}

}