package DropDowns_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown_Value_WithOut_SelectClass_4 {
	// You not allowed to use select class & not allowed to use getOptions() method
	// aswell
	// Q:In this case how can we handle this ?
	// A:driver.findElements() --> method

	// See in this case we need to write the Generic xpath/css To handle the ALL
	// WebElements
	// in 1 -> Go
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// List<WebElement> countrylist =
		// driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

		By countrylist = By.xpath("//select[@id='Form_getForm_Country']/option");
		/*
		 * for (WebElement e : countrylist) { String str = e.getText();
		 * System.out.println(str); if (str.equals("Cuba")) { e.click(); break; }
		 * 
		 * }
		 */

		selectDropdownWithOutSelect(countrylist, "Cuba");

	}

	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);
	}

	public static void selectDropdownWithOutSelect(By Locator, String value) {
		List<WebElement> countrylist = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));

		for (WebElement e : countrylist) {
			String str = e.getText();
			System.out.println(str);
			if (str.equals(value)) {
				e.click();
				break;
			}

		}

	}

}
