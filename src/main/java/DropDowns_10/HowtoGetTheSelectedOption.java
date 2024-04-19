package DropDowns_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowtoGetTheSelectedOption {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// identify element
		WebElement continent = driver.findElement(By.xpath("//*[@name='continents']"));
		// Select class for dropdown
		Select select = new Select(continent);
		// select an item with text visible
		select.selectByValue("Australia");
		// get selected option with getFirstSelectedOption() with its text
		WebElement option = select.getFirstSelectedOption();
		String selectedoption = option.getText();
		System.out.println("Selected element: " + selectedoption);
		driver.quit();
	}
}