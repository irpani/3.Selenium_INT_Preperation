package Actions_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_1 {

	// Create instance of web driver
	WebDriver driver;

	@Test
	public void keyboardAndMouseEventUsingActionClassInSelenium() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		Action action1 = action.keyDown(text, Keys.SHIFT).sendKeys("Bhanu Pratap").keyUp(text, Keys.SHIFT).build();
		action1.perform();

	}
}
