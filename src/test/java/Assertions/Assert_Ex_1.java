package Assertions;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Ex_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https//:gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);

		String actual_error = driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getAttribute("innerHTML");
		System.out.println("The actual error msg is " + actual_error);
		String expected_error = "Please enter your email. ";

		Assert.assertEquals(actual_error, expected_error);

	}

}