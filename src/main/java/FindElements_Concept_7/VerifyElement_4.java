package FindElements_Concept_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement_4 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		// By ContactSaleLink = By.linkText("Contact Sales");
		// Trw if elemenet got chnaged
		By ContactSaleLink = By.linkText("Contact Sales11");
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// driver.findElement(By.linkText("Contact Sales")).click();
		boolean flag = driver.findElement(By.linkText("Contact Sales")).isDisplayed();

		System.out.println(flag);

		// we can also Validate the element like this
		if (driver.findElements(ContactSaleLink).size() >= 1) {
			System.out.println("Contact sales link  Present on the page");

		}

		System.out.println(isElementExist(ContactSaleLink));

	}

	//
	public static boolean isElementExist(By Locator) {
		int elementCount = driver.findElements(Locator).size();
		System.out.println("total Elements found");
		if (elementCount >= 1) {

			System.out.println("Element is found" + Locator);
			return true;
		} else {
			return false;
		}
	}

}
