package DropDowns_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValues_Without_Using_SelectMethods_3 {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		By country = By.id("Form_getForm_Country");

		doSelectDropDownValue(country, "India");

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSelectDropDownValue(By Locator, String value) {
		Select select = new Select(getElement(Locator));

		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				System.out.println("Selected in the Dropdown value:" + value);
				break;
			}
		}

	}

}