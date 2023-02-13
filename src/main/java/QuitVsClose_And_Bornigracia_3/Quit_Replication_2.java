package QuitVsClose_And_Bornigracia_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quit_Replication_2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

		driver.quit(); // All Browser Session Closed.

		// driver.getCurrentUrl();// session_ID become =null after quit() method

		// So U should reinitialize driver again ...
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
