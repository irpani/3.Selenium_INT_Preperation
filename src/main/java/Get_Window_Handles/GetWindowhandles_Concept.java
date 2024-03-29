package Get_Window_Handles;

import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowhandles_Concept {

	public static WebDriver driver;

	protected static WebDriver windowByTitle(WebDriver driver, String title) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
			if (title.equals(driver.getTitle())) {
				return driver;
			}
		}
		throw new NoSuchWindowException("Window with title not found: " + title);
	}

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		windowByTitle(driver, "Google");
	}

}
