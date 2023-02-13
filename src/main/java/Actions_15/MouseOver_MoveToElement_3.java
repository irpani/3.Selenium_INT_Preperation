package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Q:How to deal with Actions ?
//A:____Simple Logic  create webElement then perform Actions _______
public class MouseOver_MoveToElement_3 {

	// Move to Element ---- It's not mouse over [Selenium will not perform this ...]
	// we call it As paret to child Menu

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		// WebElement parentMenu = driver.findElement(By.cssSelector("a.menulink"));

		/*
		 * Actions act = new Actions(driver);
		 * act.moveToElement(parentMenu1).build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.linkText("COURSES")).click();
		 */

		// Spicejet -- take it as Assignment
		// Amazon sign in -- take it as Assignment
		// https://demo.opencart.com/index.php?route=account/login -- take it as
		// Assignment

		By contentMenu = By.cssSelector("a.menulink");
		By coursesLink = By.linkText("COURSES");
		By articlesLink = By.linkText("ARTICLES");
		// doMoveToElement(contentMenu);
		doClickOnChildMenu(contentMenu, coursesLink);
		Thread.sleep(3000);
		doClickOnChildMenu(contentMenu, articlesLink);

	}

	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);
	}

	public static void doMoveToElement(By Locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(Locator)).build().perform();
	}

	public static void doClickOnChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException {

		doMoveToElement(parentMenuLocator);
		Thread.sleep(5000);
		getElement(childMenuLocator).click();
	}

}