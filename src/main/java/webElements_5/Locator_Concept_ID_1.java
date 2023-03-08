package webElements_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Element_Util_6.Element_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Concept_ID_1 {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();// (1).Launch the Browse
		driver.get("https://demo.opencart.com/index.php?route=account/login");// (2).Enter the URL

		// (3).Page got loaded

		// (4).Always Crete the web Element then Perform Actions
		// Q:How to create webElements ?
		// A: with help of driver.findElement(by)=> method asks send parameter as by
		// Locator --- In this class we will 7 types of By locator handling

		// create webElement +actions(Click,sendkeys,getetxt(),isDisplayed,isEnabled()
		// .Click()
		// .sendkeys()
		// .getText()
		// getAttribute

		// IsSelected()
		// IsEnabled()
		// IsDisplayed()

		// Locator's ----8 types
		// id /name /classname /tagname/link text/partial link text/css/xpath
		// _____ID:__________
		// Application URL => https://demo.opencart.com/index.php?route=account/login
		// id: id is a method() ,which type of method =>It's a static method
		// By class expect a String
		// <Tag k1=v,k2=v,k3=v >
		// Ex:<input attribute_name1='att value-1',attribute_name2='att
		// value-2',attribute_name3='att value-3'>
		// Type_1:-First Approch is the Worst Approch back to back 100 lines
		// driver.findelement() --- Looks ugly code
		// ---------------- There is no reusability

		// 1st Approch:-
		// ----------------
		driver.findElement(By.id("input-email")).sendKeys("naveenautomation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2nd Approch::- Reusable[Storing in Var] when compare to first one
		// ----------------
		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement passWord = driver.findElement(By.id("input-password"));
		emailId.sendKeys("input-email");
		passWord.sendKeys("input-password");

		// 3rd Approch::- [By Locator Approch] In 3rd Approch hey y don't u create a By
		// Locator
		// ----------------
		By username = By.id("input-email");
		By password = By.id("input-password");
		WebElement emilid = driver.findElement(username);
		WebElement pd = driver.findElement(password);
		emailId.sendKeys("naveenautomation20@gmail.com");
		pd.sendKeys("test@123");

		// Among 1,2,3 which one u prefer ? (A):3 is better

		// Can we improve 3rd Approch writing again & again driver.findElement()
		// Can we write one generic method to create the webElement

		// (4) and (5) are almost same ....
		// 4th Approch: By locator with Generic Method Approch
		// -------------------------------------------
		// In 4th Approch we ruturned findelement() Only 1 time
		getElement(username).sendKeys("naveenautomation20@gmail.com");
		getElement(password).sendKeys("test@123");

		// 5th Approch: By locator with Generic Method(getElement() with action methods}
		// Q:How many times you are using sendkeys() --- only once right This is real
		// time Approch
		doSendkeys(username, "naveenautomation20@gmail.com");
		doSendkeys(password, "test@123");

		// (4),(5) cases are returned in Individually y cann't we create one generic
		// class so that utilized globally in my Framework level
		// utilized for Any page webApplication

		// 6th Approch:Element_util class with Generic Methods:
		// ---------------------------------------------------
		// Y cann't we right a Generic Class

		By username1 = By.id("input-email");
		By password1 = By.id("input-password");
		Element_Util eleUtil = new Element_Util(driver); // here Driver pointed to Chrome Already Initialized in this
															// class
		eleUtil.getElement(username1);
		eleUtil.doSendkeys(username1, "naveenautomation20@gmail.com");
		// eleUtil.doClick(Locator);
		// eleUtil.doClick(Locator);
		// ____7th Approch:______
		// 7th Approch:What could be the 7th Aproch?
		// String Locator's: Not preferable ...
		// ------------------
		// Some people did to not use the By Locator's they used String locator Value..
		// I'm not Comfortable with By locator I want to use String locator's
		// By username1 = By.id("input-email"); this 6th Approch Again Devided 2 parts

		// I need to practice more here ....7th approch

		// ____8th Approch ???____

		// ____9th Approch ???_____
		By userame = By.name("username");
		// I'm going to apply wait for specific Element so I create Object for it ...
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// presenceOfElementLocated() -expect a By locator not a webElement
		// until() -- return a webElement
		WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		userName.sendKeys("naveen");

	}

	// Method name getElement expect By locator as parameter I will give the
	// webElement
	public static WebElement getElement(By Locator) {

		// driver.findElement(by) what type of locator I don't know
		return driver.findElement(Locator);
	}

	public static void doClick(By Locator) {

		getElement(Locator).click();
	}

	public static void doSendkeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

	public static void goGetText(By Locator) {

		getElement(Locator).getText();
	}

	public static String getAttribute(By Locatror, String str) {

		return getElement(Locatror).getAttribute(str);

	}

}
