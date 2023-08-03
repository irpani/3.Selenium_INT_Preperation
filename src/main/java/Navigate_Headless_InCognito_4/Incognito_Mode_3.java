package Navigate_Headless_InCognito_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito_Mode_3 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

	}

}
