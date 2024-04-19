package Alert_Popups_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_Alert_1 {
	static WebDriver driver;

	private static void browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		findElement.click();
	}

	private static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// alert.dismiss();
	}

	public static void main(String[] args) throws InterruptedException {
		browser();
		Thread.sleep(3000);
		simpleAlert();

	}

}
