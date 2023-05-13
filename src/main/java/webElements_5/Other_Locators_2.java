package webElements_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Remember Attributes Are available in the form of (Key, Value) Pairs ...
//Set (1):These below are Attributes  We can Compare these 3 Which One is best 
//1...Id()
//2....name()
//3....classname()

//We cann't compare id xpath bcz we cann't compare Apple & Orange
//Set (2): xpath() & CSS()
//These are not Attributes these are address Of an webElements

//Set (3):
//Link text() is not an attribute it's just text of the link
//Partial link text()

//Set (4):tagname
public class Other_Locators_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// (1).id -It's Unique attribute Can n't be Duplicate

		// (2). name:- CRM PRO Application
		// ------ Name can be Duplicate 99% of cases Unique.....

		// b/w Id & name ==> Id will prefered

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		/*
		 * driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("test@123");
		 */
		/*
		 * By email_id = By.name("username"); By pwd = By.name("password"); Element_Util
		 * eleUtil = new Element_Util(driver); eleUtil.doSendkeys(email_id,
		 * "test@gmail.com");
		 */

		// (3).____Class Name____It's also attribute [App:orangeHRM],Not preferable ...
		// It is not mandatory as unique ...
		// The problem with this locator is multiple Elements having same class name If
		// I try to
		// enter the username It will enter the username on the very first time class
		// Name located

		// driver.findElement(By.className("form-control")).sendKeys("naveen");

		// (4).xapth ----It's not an attribute It's an addess of an webElement inside
		// html dom
		// How to use xpath ?

		// (1).Absolute xpath -- /html/body/div[2]/div/div[3]/form/div/input[1]
		// Problem with Abs xpath if position of the element chnaged Element will not
		// work
		// (2).Relative Xpath -- *[@id="input-email"]
		// Changing the element is minimal ....
		// driver.findElement(By.xpath("*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("test@123");
		// Element_Util element_Util=new Element_Util();

		/*
		 * By uname = By.xpath("*[@id=\\\"input-email\\\"]"); Element_Util e = new
		 * Element_Util(driver); e.doSendkeys(uname, "test@gmail.com")
		 */;

		// (5).______Css Cascade Style Sheet______
		// #loginForm > div > input:nth-child(1)
		// driver.findElement(By.cssSelector("#loginForm > div >
		// input:nth-child(1)")).sendKeys("test@gmail.com");

		// Q: Compare xpath VS css multiple points we cn discuss later ...
		// imp point html tag of links always <a >
		// (6).Linktext ---> Name it self we can understand It's only for links
		By register = By.linkText("Register");
		// driver.findElement(By.linkText("Register")).click();

		// (7).Partial Link text() -- Applicable same like links
		// Q:Is it recomonded to use?
		// A:No
		// There are Some Applications test is too long in that case w will use this ...
		// link name ---- This is my privacy policy
		// driver.findElement(By.partialLinkText("policy").click();
		// Privay policy
		// user policy these 2 links On webpage In this which one it click(),it n't work
		// Accurately..
		// so we cann't use partial link text

		// (8).tagname() ---Also have couple of uses we will discuss in upcoming
		// chapters
		// tagname means ---- html tag
		/*
		 * <h1> </h1> big size text on ui <h2> </h2> <h3> </h3> <h4> </h4> <h5> </h5>
		 * <h6> </h6> Small size text On ui
		 * 
		 * <p> --- paragraph <span> --- span
		 * 
		 * <div> </div> <ul> </ul> <li> </li>
		 */

		// I can gettext() -----> with links
		// -----> with headers
		// -----> I can use gettext() any kind of label on the page
		// getElement(register);
		// doClick(register);

		By header = By.tagName("Love your software");
		if (doGetText(header).contains("Love your software")) {
			System.out.println("h1 header is correct");
		}
	}

	// here I'm doing rough work so I created methods as static ...
	public static WebElement getElement(By Locator) {

		return driver.findElement(Locator);
	}

	public static void doClick(By Locator) {

		getElement(Locator).click();
	}

	public static String doGetText(By Locator) {

		return driver.findElement(Locator).getText();
	}

}
