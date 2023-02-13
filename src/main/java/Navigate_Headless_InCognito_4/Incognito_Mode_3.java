package Navigate_Headless_InCognito_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito_Mode_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

	}

}
