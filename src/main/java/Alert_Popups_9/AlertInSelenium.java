package Alert_Popups_9;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium {

	WebDriver driver;

	@Test
	public void enterText() throws InterruptedException, ParseException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		// navigate to site
		driver.get("file:///Users/bsingh5/Downloads/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		// An implicit wait tells WebDriver to poll the DOM for a certain amount of time
		// when trying to find an element
		// or elements if they are not immediately available.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='side-menu']/li[7]/a")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String data = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		if (data.equals("You pressed Cancel!")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "actual text is: " + data);
		}
		driver.get("file:///Users/bsingh5/Downloads/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.findElement(By.xpath("//a[@href='alert.html']")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
