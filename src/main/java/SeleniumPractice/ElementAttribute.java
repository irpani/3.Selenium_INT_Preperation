package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/?ref_=icp_country_from_us");

		By links = By.tagName("a");
		By images = By.tagName("img");

		// List<WebElement> linksList = getElements(links);
		// System.out.println("total links ==>" + linksList.size());
		//
		// for(WebElement e : linksList) {
		// String hrefVal = e.getAttribute("href");
		// String linkText = e.getText();
		//
		// System.out.println(hrefVal + " ---> "+ linkText);
		// }

		// List<WebElement> imagesList = getElements(images);
		// System.out.println("total images: " + imagesList.size());
		//
		// for(WebElement e : imagesList) {
		// String srcVal = e.getAttribute("src");
		// System.out.println(srcVal);
		// }

		getElementAttributes(images, "src");
		getElementAttributes(links, "href");

	}

	public static void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
