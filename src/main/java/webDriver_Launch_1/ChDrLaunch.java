package webDriver_Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChDrLaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");
		driver.manage().window().maximize();
		String actTitle = driver.getTitle();
		System.out.println("Actual Title is .." + actTitle);

		if (actTitle.equals("Account Login")) {
			System.out.println("Title Matched");
		} else {

			System.out.println("Title Not matched");
		}

		String actUrl = driver.getCurrentUrl();
		System.out.println("Actual Curent URL.." + actUrl);
		String actWindow = driver.getWindowHandle();
		System.out.println("Actual Window is .." + actWindow);

		driver.quit();

	}

}
