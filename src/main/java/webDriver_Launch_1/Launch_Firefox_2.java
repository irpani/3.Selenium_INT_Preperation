package webDriver_Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Firefox_2 {

	public static void main(String[] args) {
		// ____Firefox Launch____
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);
		driver.quit();

		// ______Instead of Individual Launching like above _____
		// (1).Chrome launch =>WebDriver driver = new ChromeDriver();
		// (2).Firefox Launch =>WebDriver driver = new FirefoxDriver();
		// (3).Safari launch =>WebDriver driver = new SafariDriver();
		// (4).Opera Launch =>WebDriver driver = new OperaDriver();
		// (5).Edge Launch =>WebDriver driver = new EdgeDriver();

		// Go with Top casting main Advantage ----> to perform Cross Browser Testing

	}

}
