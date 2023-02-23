package WeitingGame_Synchronization_16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//explicit_wait can be applied in the form of either  fluent_wait/webDriver_wait ....
//(Q1): fluent_wait Already avialable y they created webDriver_wait also ?
//(Q2):Do we really need webDriver wait ?
//This webDriver wait don't have anything 1 protected method timeOutException() that to not used much 
//A1: You don't get into the fluent wait Directly 
//A2:you can start using  webDriver wait because we given couple of Constructor's are Available 
//So u can define your explicit wait

//They have given couple of Constructor's in webDriver_Wait that's y at core level we will called Fluent wait Only;
public class Wait_For_Elem_Concept_3 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		// By Locator's:
		By username = By.name("username11");
		By password = By.name("password");
		By login = By.name("login");
		By footerlink = By.xpath("//div[@class='col-sm-6 margin copy']/p");
		// ______Explicit wait defined timeout of 10 sec______
		// I'm going to apply wait for specific Element so I create Object for it ...
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// presenceOfElementLocated() -expect a By locator not a webElement
		// until() -- return a webElement

		// WebElement userName =
		// wait.until(ExpectedConditions.presenceOfElementLocated(username));

		// userName.sendKeys("irfan.shaik77@gmail.com");
		// ____No explicit wait Applied for the 2 remaining webElements_____
		// driver.findElement(password).sendKeys("password"); // No explicit wait
		// Applied
		// driver.findElement(login).click(); // No explicit wait Applied
		// I chnaged intentionally usename locator as username11 so the below exception
		// thrown ...
		// org.openqa.selenium.TimeoutException: Expected condition failed:
		// waiting for presence of element located by: By.name: username11
		// (tried for 10 second(s) with 500 milliseconds interval)

		// while running immediately it will thrown exception
		// webDriver max duration time 10 sec crossed so it will raise exception->
		// org.openqa.selenium.TimeoutException & No such Element Exception

		// Q:What do u mean By timeout Exception?

		// doPresenceOfElementLocated(username, 10).sendKeys("naveen");

		// doSendkeys(username, 10, "naveen");

		// Please remember In selenium default pooling time 500 milliSeconds ,here we
		// also customize our pooling time
		// doPresenceOfElementLocated(username, 10, 1000);
		// Here How many pooling intervals it will take uptomax time for that I
		// deliberately chng the locator uname to uname11

		// waitForElementsToBeVisible(footerlink, 10);
		/*
		 * List<WebElement> list = waitForElementsToBeVisible(footerlink, 10, 1000);
		 * 
		 * for (WebElement e : list) { System.out.println(e.getText()); }
		 */
		List<String> textlist = doElementsgetText(footerlink, 10);
		if (textlist.contains("Forgot Password?")) {
			System.out.println("pass");
		}
	}

	public static void doSendkeys(By locator, int timeout, String value) {
		doPresenceOfElementLocated(locator, timeout).sendKeys(value);

	}

	// Q: Which is Better Presence Of Element or Visibility Of Element ?
	// A: Visibility Of Ele is better because It is not only check the presece Of
	// element bust also visibity height & width
	/*
	 * ______(1).presenceOfElementLocated(Locator):_______ An expectation for
	 * checking that an element is present on the DOM of a page. This does
	 * notnecessarily mean that the element is visible. Parameters:locator used to
	 * find the elementReturns:the WebElement once it is located
	 */

	// With_out Pooling Interval Time
	public static WebElement doPresenceOfElementLocated(By Locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}

	// With Pooling Interval Time
	// Customize Pooling Time also we can write
	// poolingTime/Interval Time both are Equal
	public static WebElement doPresenceOfElementLocated(By Locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}

	// ___________(2).Visibility Of One Element______
	// 2(a)
	/*
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0. Parameters:locator used to find
	 * the elementReturns:the WebElement once it is located and visible
	 */
	// With_out Pooling Interval Time
	public static WebElement waitForElementToBeVisible(By Locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}

	// With Pooling Interval Time:
	public static WebElement waitForElementToBeVisible(By Locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}

	// 2(b).Vivibility Of Element with webElement
	public static WebElement waitForElementToBeVisibleWithWebElement(By Locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locator)));
	}

	// _______Visibility Of Multiple Elements:_____
	// ___________(3).Elements Visible______ It's like driver.findElements() method
	public static List<WebElement> waitForElementsToBeVisible(By Locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
	}

	public static List<WebElement> waitForElementsToBeVisible(By Locator, int timeOut, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
	}

	// getting text for multipe Elments
	public static List<String> doElementsgetText(By Locator, int timeOut) {
		List<WebElement> list = waitForElementsToBeVisible(Locator, timeOut);
		List<String> eletextList = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			eletextList.add(text);
		}
		return eletextList;
	}

}
