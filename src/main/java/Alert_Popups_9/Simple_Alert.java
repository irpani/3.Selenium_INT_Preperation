package Alert_Popups_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {
	static WebDriver driver;

	private static void browser() {
		driver = new ChromeDriver();

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
		;

	}

}
