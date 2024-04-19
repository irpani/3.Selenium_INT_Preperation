package Frames_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCrm_FrameHandle_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// .sleep(5000);
		driver.switchTo().frame("mainpanel");// By adding this now below step start working
		driver.findElement(By.linkText("CONTACTS")).click(); // Getting No such Ele Exception
		// because this wenbElement available in Frame
		driver.switchTo().defaultContent();

	}

}
