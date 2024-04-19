package Actions_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_2 {

	// Create instance of web driver
	WebDriver driver;

	@Test
	public void keyboardAndMouseEventUsingActionClassInSelenium() throws InterruptedException {

		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver","/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver","/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver");

		WebDriverManager.firefoxdriver().setup();
		// Create Object of driver.
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement pass = driver.findElement(By.name("reg_passwd__"));

		Actions action = new Actions(driver);
		action.keyDown(firstname, Keys.SHIFT).sendKeys("Bhanu Pratap").keyUp(firstname, Keys.SHIFT).build().perform();
		action.keyDown(lastname, Keys.SHIFT).sendKeys("Singh").keyUp(lastname, Keys.SHIFT).build().perform();
		action.keyDown(email, Keys.SHIFT).sendKeys("tset@gmail.com").keyUp(email, Keys.SHIFT).build().perform();
		action.keyDown(pass, Keys.SHIFT).sendKeys("68899900").keyUp(pass, Keys.SHIFT).build().perform();

	}
}
