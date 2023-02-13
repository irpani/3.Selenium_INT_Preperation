package WeitingGame_Synchronization_16;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait_famousInt_Question_9 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email = By.name("email");
		// _____Logic____
		// While Loop ---we don't how many iterations element got found
		// sleep is basically (Static wait) ---- On top of that we will apply Dynamic
		// wait

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	// ____With_Out Time poll Interval _____
	// I create My own Customwait
	public static WebElement retryingElement(By Locator, int timeOut) {

		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(Locator);
				break;
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.out.println("Element is not foud in attempt:" + attempts + ":" + Locator);
			}

			try {
				Thread.sleep(500); // Default TimeOut - 500 miiliSec Only ....
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			attempts++;
		}
		// I return customose Exception

		if (element == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out
						.println("Element is not foud in attempt tried for" + timeOut + "with the interval of:" + 1000);
			}

		}
		return element;

	}

	// ____With Time poll Interval _____
	public static WebElement retryingElement(By Locator, int timeOut, long pollingTime) {

		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = getElement(Locator);
				break;
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.out.println("Element is not foud in attempt:" + attempts + ":" + Locator);
			}

			try {
				Thread.sleep(pollingTime); // Default TimeOut - 500 miiliSec Only ....
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			attempts++;
		}
		// I return customose Exception

		if (element == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println(
						"Element is not foud in attempt tried for" + timeOut + "with the interval of:" + pollingTime);
			}

		}
		return element;

	}
}
