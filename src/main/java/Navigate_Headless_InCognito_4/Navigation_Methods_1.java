package Navigate_Headless_InCognito_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Q:Is there any Difference b/w driver.get()    (Vs) driver.navigate.To()
//A:No
// __________Navigatgion Methods____________
//(1).driver.navigate().to
//(2).driver.navigate().back();
//(3).driver.navigate().forward();
//(4).driver.navigate().refresh();

public class Navigation_Methods_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Current title of the Page is:" + title);

		// I navigated to Amazon Site --- Successfully landed on this Site
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());

		// Now I want to back again On My previous Page
		driver.navigate().back();
		System.out.println(driver.getTitle());

		// Now I want to forward again
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		driver.close();
	}

}
