package WeitingGame_Synchronization_16;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_For_JavaScriptAlert_5 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mail.reddif.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		// (1).Plan code for Alert
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.accept();
		 */

		// (2).wait Applied to Alert
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); Alert
		 * alert = wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(alert.getText()); alert.accept();
		 */
		// (3).Generic Mehod return for Alert

		Alert alert = waitForAlert(10);
		System.out.println(alert.getText());
		alert.accept();
		// alert.dismiss();
	}

	public static Alert waitForAlert(int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String doAlertText(int timeOut) {
		return waitForAlert(timeOut).getText();

	}

	public static void doAlertAccept(int timeOut) {
		waitForAlert(timeOut).accept();

	}

	public static void doAlertDismiss(int timeOut) {
		waitForAlert(timeOut).dismiss();

	}

	public static void doAlertSendKeys(int timeOut, String value) {
		waitForAlert(timeOut).sendKeys(value);

	}

}