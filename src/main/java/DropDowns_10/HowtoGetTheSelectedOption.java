package DropDowns_10;

import java.util.concurrent.TimeUnit;

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

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// identify element
		WebElement t = driver.findElement(By.xpath("//*[@name='continents']"));
		// Select class for dropdown
		Select select = new Select(t);
		// select an item with text visible
		select.selectByVisibleText("Australia");
		// get selected option with getFirstSelectedOption() with its text
		WebElement o = select.getFirstSelectedOption();
		String selectedoption = o.getText();
		System.out.println("Selected element: " + selectedoption);
		driver.close();
	}
}