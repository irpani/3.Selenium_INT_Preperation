package QuitVsClose_And_Bornigracia_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Replication_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // http(or)https is mandatory ,www --optional
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

		driver.close(); // Close The Browser

		// driver.getCurrentUrl();// Same session_ID maintained After close() method,But
		// Invalid session_Id

		// So U should reinitialize driver again ...
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);

	}
}