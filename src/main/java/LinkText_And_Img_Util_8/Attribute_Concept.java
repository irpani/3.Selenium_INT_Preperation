package LinkText_And_Img_Util_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attribute_Concept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		By amazonDevicesLink = By.linkText("Amazon Devices");

		String hrefVal = getAttributeValue(amazonDevicesLink, "href");
		if (hrefVal.contains("footer_devices")) {
			System.out.println("This is Correcr href");
		}
	}

	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);
	}

	// Generic Methods for getAttribute():
	public static String getAttributeValue(By Locator, String attrName) {

		return getElement(Locator).getAttribute(attrName);

	}

}
