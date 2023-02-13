package Navigate_Headless_InCognito_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browser_2 {

	// 0.Html unit Driver --> Deprecated
	// ____Headless Mode _____
	// 1.No Browser Launch(Not Visible)/hidden Browser
	// 2.Testing is happening behind the scene
	// 3.faster
	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions co = new
		 * ChromeOptions(); co.addArguments("--headless"); WebDriver driver = new
		 * ChromeDriver(co);
		 */

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

	}

}
