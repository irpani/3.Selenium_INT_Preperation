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

public class DragNDropExample {
	WebDriver driver;

	@Test
	public void testDragAndDropExample() throws InterruptedException {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));

		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
		String actualText = driver.findElement(By.cssSelector("#droppable>p")).getText();
		Assert.assertEquals(actualText, "Dropped!");
		driver.quit();
	}
}