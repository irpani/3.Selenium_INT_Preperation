package JavaScript_Concept_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTopics {
	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		// Scroll vertically by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		// Scroll vertically to an element

		WebElement element = driver.findElement(By.id("element-id"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		// Scroll horizontally by pixel
		js.executeScript("window.scrollBy(500, 0)");
		// Perform further actions after scrolling
		// ...
		// Close the browser
		driver.quit();
	}
}
