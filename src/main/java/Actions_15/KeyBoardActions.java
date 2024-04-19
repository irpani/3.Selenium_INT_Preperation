package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		// Find an input field element
		WebElement inputField = driver.findElement(By.id("input-field-id"));
		// Type text with keyboard actions
		inputField.sendKeys("Text to type");
		// Press Enter key
		inputField.sendKeys(Keys.ENTER);
		// Type special characters with keyboard actions
		inputField.sendKeys(Keys.CONTROL, "a");
		inputField.sendKeys(Keys.BACK_SPACE);
		// Perform further actions after keyboard actions
		// ...
		// Close the browser
		driver.quit();
	}
}
