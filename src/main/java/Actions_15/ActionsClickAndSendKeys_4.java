package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//*** Int Que***
//Q:In howmany ways we can use sendkeys()  A: 3 Ways ..
//1. using ddiver.findElement(By loc).sendkeys() method
//2. doActionSendkeys(By Locator, String value)
//3.doActionSendkeysOnActiveWebElement(By Locator, String value)

//Q: what is the Difference B/w normal sendkeys() ans Action class sendkeys () methos
//A:Actions class sendkeys() methoid first act.click () => to active the Element
//then perform Actions like sendkeys()

public class ActionsClickAndSendKeys_4 {
	// Q:How to deal with Actions ?
	// A:____Simple Logic create webElement then perform Actions _______
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.linkText("Register")).click();
		Actions act = new Actions(driver);

		/*
		 * driver.findElement(By.linkText("Register")).click(); WebElement firstName
		 * =driver.findElement(By.id("input-firstname")); WebElement
		 * lastName=driver.findElement(By.id("input-lastname"));
		 * 
		 * Actions act = new Actions(driver);
		 * act.sendKeys(firstName,"irfan").build().perform();
		 * act.sendKeys(lastName,"pathan").build().perform();
		 */

		By firstName = By.id("input-firstname");
		By lastName = By.name("lastname");
		By checKBox = By.name("agree");
		// act.click(driver.findElement(checKBox)).build().perform();

		// doActionSendkeys(firstName, "Irfan");
		// doActionSendkeys(lastName, "Pathan");
		// doActionSendkeysOnActiveWebElement(firstName, "Irfan");
		// doActionSendkeysOnActiveWebElement(lastName, "Pathan");
		// doActionClick(checKBox);
		doActionClick(checKBox);
		// doActionClickMoveToElement(checKBox);
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doActionSendkeys(By Locator, String value) {

		Actions act = new Actions(driver);
		act.sendKeys(getElement(Locator), value).build().perform();
	}

	public static void doActionSendkeysOnActiveWebElement(By Locator, String value) {

		Actions act = new Actions(driver);
		act.click(getElement(Locator)).sendKeys(value).build().perform();
	}

	// in Actions click() method Clicks on the middle of the webElement
	// Equivalent to Actions.moveToElement(onElement).click();
	public static void doActionClick(By Locator) {

		Actions act = new Actions(driver);
		act.click(getElement(Locator)).build().perform();
	}

	public static void doActionClickMoveToElement(By Locator) {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(Locator)).click().build().perform();
	}
}