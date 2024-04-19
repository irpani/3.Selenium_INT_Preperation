package DropDowns_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//In select Class we have few more methods to all Dropdown Options -->getoptions()

public class AllDropDown_Handling_Values_With_Select_Tag_2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		Select select = new Select(country);
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size());

		if (countryList.size() - 1 == 232) {
			System.out.println("country count is correct");

		}
		// I need index also

		/*
		 * for (int i = 0; i < countryList.size(); i++) { String str =
		 * countryList.get(i).getText(); System.out.println(i + "--->" + str); }
		 */

		// with for each loop also we can write index no will print on console
		int count = 0;
		for (WebElement e : countryList) {
			count++;
			System.out.println(count + "--->" + e.getText());

		}

	}
}