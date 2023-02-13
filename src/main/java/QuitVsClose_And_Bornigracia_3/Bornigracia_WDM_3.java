package QuitVsClose_And_Bornigracia_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bornigracia_WDM_3 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup(); // Add Dependency in pom.xml It will Automatically Download the
													// Correct .exe file
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

	}

}
