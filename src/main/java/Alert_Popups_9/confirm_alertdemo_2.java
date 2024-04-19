package Alert_Popups_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class confirm_alertdemo_2 {
	static WebDriver driver;

	private static void browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		// WebElement findElement =
		// driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		// findElement.click();
	}

	private static void ConfirmA(String s) {
		Alert alert = driver.switchTo().alert();
		if (s.equalsIgnoreCase("accept")) {
			alert.accept();

		} else {
			alert.dismiss();
		}
	}

	public static void main(String[] args) {
		browser();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		ConfirmA("accept");
		// ConfirmA("dismiss");

	}

}