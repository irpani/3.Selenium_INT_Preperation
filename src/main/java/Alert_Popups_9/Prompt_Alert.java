package Alert_Popups_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {
	static WebDriver driver;

	private static void browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}

	private static void PromptA(String s) {
		Alert alert1 = driver.switchTo().alert();
		if (s.equalsIgnoreCase("accept")) {
			alert1.accept();
		} else {
			alert1.dismiss();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		browser();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().sendKeys("Selenium Automation Testing");
		Thread.sleep(2000);
		PromptA("accept");
		// PromptA("dismiss");

	}

}