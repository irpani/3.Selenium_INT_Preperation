package JavaScript_Concept_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_concept {

	/*
	 * Scroll page and other views as needed. If we scroll page it will scroll the
	 * page. To scroll in a view we have to go to that view element and scroll then
	 */

	public static void main(String[] args) throws InterruptedException {

		// FirefoxProfile firefoxProfile = new FirefoxProfile();
		// firefoxProfile.setPreference("reader.parse-on-load.enabled", false);
		WebDriverManager.firefoxdriver().setup();
		// System.setProperty("webdriver.gecko.driver",
		// "D://Selenium//softwares//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		JavascriptExecutor je = (JavascriptExecutor) driver;

		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		Thread.sleep(2000);
		je.executeScript("scroll(0,700)");
		Thread.sleep(3000);
		WebElement el = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[4]"));
		Thread.sleep(3000);

		je.executeScript("arguments[0].scrollIntoView(true);", el);
		Thread.sleep(5000);

		System.out.println(el.getText());
		Thread.sleep(5000);

		driver.quit();
	}

}