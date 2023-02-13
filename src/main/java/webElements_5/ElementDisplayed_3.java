package webElements_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed_3 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();// (1).Launch the Browse
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email_id = By.id("input-email");
		/*
		 * boolean flag = driver.findElement(email_id).isDisplayed();
		 * System.out.println(flag);
		 */
		doIsDisplayed(email_id);
	}

	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);
	}

	public static boolean doIsDisplayed(By Locator) {
		return getElement(Locator).isDisplayed();

	}

}
