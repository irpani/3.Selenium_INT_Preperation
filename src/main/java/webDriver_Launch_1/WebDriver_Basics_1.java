package webDriver_Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//FYI First 4 packages like 
//WebDriver_Launch_1,webDriver_casting_2,Quitvsclose_3,Naviation_4 methods focus ondriver relate methods
// After that focus on Specific application launching url=>find webElements perform Actions...
public class WebDriver_Basics_1 {

	public static void main(String[] args) {

		// If u want to open the Google what comes in your mind Looking forBrowser to
		// open the Application/Site

		// ________ Manual Steps U ruturned as_________
		// Step1:Open Chrome
		// Step2:Enter url
		// Step3:get the Title --> Validation Point (Act Vs Exp...)
		// Step4:Get the Url
		// Step5Finally close the Browser

		// Q:Can we opened Chrome Browser Directy?
		// A:No ,we need Selenium Server
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Documents\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// here in default Constructor chrome driver launch logic return

		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

		// ______Validation/Checkpoint ______mandatory As Automation Engineer
		if (title.equals("Google")) {
			System.out.println("Title matched pass:" + title);
		} else {
			System.out.println("failed");
		}
		// driver.quit();
		driver.close();
		// Practice multiple sites Validations

	}

}
