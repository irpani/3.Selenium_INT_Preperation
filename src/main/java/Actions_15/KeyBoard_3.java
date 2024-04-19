package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_3 {

	// Create instance of web driver
	WebDriver driver;

	@Test
	public void keyboardAndMouseEventUsingActionClassInSelenium() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		// Launch the first URL
		driver.get("https://www.seleniumhq.org/");
		WebElement link = driver.findElement(By.xpath("//*[@id='menu_projects']/a"));
		Actions action = new Actions(driver);
		// for mac
		action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).click(link).keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).build()
				.perform();
		// for window
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build()
				.perform();
		// Thread.sleep(5000);
	}
}