package WeitingGame_Synchronization_16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElements_4 {

	// Implicit wait only Applicable for webElements,but we don't prefer for
	// framework
	// Explicit wait we can applied for both web & Non webElements

	// Wait_For_Elem_Concept_3 --- In this class we have seen related to webElements

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.linkText("Customers")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * boolean flag = wait.until(ExpectedConditions.urlContains("customers.html"));
		 * System.out.println(flag);
		 */

		/*
		 * if (waitForURLToBe("customers.html", 10)) {
		 * 
		 * System.out.println("url matched ->pass"); }
		 */
		// System.out.println(waitForTitleContains("CRMPRO", 10));
		String title = doGetTitle("CRMPRO", 10);
		System.out.println(title);
	}

	// ___URL _____
	// Validate the Url Contails Or not
	public static boolean waitForURLToContain(String urlfraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlfraction));

	}

	// Complete Url Validation
	public static boolean waitForURLToBe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(url));

	}

	// _____TITLE ______

	public static String doGetTitleWithFraction(String titleFraction, int timeOut) {

		if (waitForTitleContains(titleFraction, timeOut)) {

			return driver.getTitle();
		}
		return null;
	}

	public static String doGetTitle(String title, int timeOut) {

		if (waitForTitleToBe(title, timeOut)) {

			return driver.getTitle();
		}
		return null;
	}

	public static boolean waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleContains(titleFraction));

	}

	public static boolean waitForTitleToBe(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleIs(title));

	}
}
