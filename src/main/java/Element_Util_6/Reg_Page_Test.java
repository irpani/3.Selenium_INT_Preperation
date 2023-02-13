package Element_Util_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webDriver_Launch_1.BrowserUtil_4;

public class Reg_Page_Test {
	// For the same Application I have to strat My execution Directly from
	// Registration Page
	public static void main(String[] args) throws InterruptedException {
		// Q1:First what I have to Do ?
		// Q2:which class is responsible for launch the Browser
		// A: two days back we created righrt Browser util class which is responsible to
		// launch the Browser

		// Browser_Util Class:-
		// ---------------------
		BrowserUtil_4 brUtil = new BrowserUtil_4();
		WebDriver driver = brUtil.launchBrowser("chrome");
		// I return this so that I understood My driver pointing to Chrome Browser

		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		// Now To intarsct with webElements Which Class is responsible for that
		// Element Util:-
		// -----------------
		Element_Util eleUtil = new Element_Util(driver);// Here driver already pointing to Chrome
		eleUtil.doSendkeys(firstName, "Sharmin");
		eleUtil.doSendkeys(lastName, "Hoque");
		eleUtil.doSendkeys(email, "Sharmin@gmail.com");
		Thread.sleep(5000);

		brUtil.closeBrowser();
		// Q: y cann't These element Utilities taking as static in Nature?
		// A:This is the problem most of the people do it ...
		// If one utility I make it as Static webDriver also wee make it as static
		// Problem with static is where exactly It stored ?
		// A:which means driver is avaialable under CMA - Common Memory Allocation
		// maintained as only 1 copy not avaialable to all objects at a time ,availble 1
		// after another
	}

}
