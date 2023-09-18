package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {

		// ______Case (1)_______ Selenium with 3.141.59 Version
		System.setProperty("webDriver.Chrome.driver", "D:\\int_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// _______Case (2) is the Alernate for Case(1)_____
		// Which will take the ChromeDriver Latest Version
		// WebDriverManager.ChromeDriver().setup();
		// WebDriver driver=new ChromeDriver();

		// _____Case(3)____ From Selenium 4 Chrome Driver got opened but url not
		// launched

		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.quit();

	}
}
