package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverInselenium {

	WebDriver driver;

	@Test
	public void enterText() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// Navigate to site
		driver.get("https://www.actitime.com/download");

		WebElement features = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));

		// To do mouse over need to create object of action class
		Actions action = new Actions(driver);
		// build().perform() will do mouse over on given object
		action.moveToElement(features).build().perform();

	}
}