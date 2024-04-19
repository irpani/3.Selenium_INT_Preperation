package DropDowns_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag_1 {
	public static WebDriver driver;
	// Drop downs 2 types
	/*
	 * Dropdowns:- -------------- (1).Simple DropDowns with <select> tag
	 * 
	 * Q1:what are the ways of handling Dropdowns? Q2:What are different dropdowns
	 * available? Q3:How to handle Dropdowns
	 * 
	 * (2).Jquery DropDowns:- No<select> tag ----------- we will see in upcoming
	 * chapters also some Complex Dropdowns
	 */

	public static void main(String[] args) {

		// Like linktext ---> html tag -----> <a> Anchor tag
		// DropDown ---> html tag -----> <Select> tag
		// select class{ } -->Already available in selenium we just use the values
		// to handle the dropdowns
		// Select class Applicable for only those dropdowns having html tag => select

		// 3 imp Methods
		// selectByIndex() -------> fixed like days31 ,months12 we will prefer this
		// selectByVisibleText() ------> text Of the Option [Choose Exact text on UI]
		// selectByValue ------> value Of the Attribute

		// Note:selectByIndex() -- Country Dropdown problem is trw there is a chance of
		// Adding 2 more countries
		// so that index changed so not preferred for dynamic dropdowns

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// first I want to create webElement of Dropdown ....
		// WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		By country = By.id("Form_getForm_Country");

		// Select select=new Select(); //here Deffault Constructor throwing error
		// It expected to pass the by locator

		// Int Q: Select class Dropdown expected 1 webElement
		// Select select = new Select(country); // So Countrty drop down passing in
		// select class
		// 3 important methods
		// select.selectByIndex(13); //wil not gurantee give exact value dev may add
		// more values index got disturbed
		// select.selectByVisibleText("Albania");
		// select.selectByValue("Cambodia");

		// dropDownSelectByIndex(country, 4);
		// dropDownSelectByVisibleText(country, "India");
		dropDownSelectByVisibleText(country, "India");
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void dropDownSelectByIndex(By Locator, int index) {

		Select select = new Select(getElement(Locator));
		select.selectByIndex(index);

	}

	public static void dropDownSelectByVisibleText(By Locator, String text) {

		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(text);

	}

	public static void dropDownSelectByValue(By Locator, String value) {

		Select select = new Select(getElement(Locator));
		select.selectByValue(value);

	}

	// Assignment face book day month year Dropdown handling try with these Gen
	// Methods
}
