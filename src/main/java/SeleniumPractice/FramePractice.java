package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");// page
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("India-9090");

		driver.switchTo().defaultContent();

	}

}
