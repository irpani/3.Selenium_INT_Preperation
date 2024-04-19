package Actions_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropInSelenium {
	// Create instance of web driver
	WebDriver driver;

	@Test
	public void enterDataInTextField() throws InterruptedException {

		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		// Create Object of driver.
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(7000);
		// driver.navigate().refresh();
		// Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement sourceObject = driver.findElement(By.cssSelector("#draggable"));
		WebElement targetObject = driver.findElement(By.cssSelector("#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceObject, targetObject).build().perform();
		Assert.assertEquals(targetObject.getText(), "Dropped!");
	}

}
