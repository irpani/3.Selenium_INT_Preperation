package Assertions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Failed_test_cases {

	WebDriver driver;

	@Test
	public void captureScreen() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='emailvhhhj']")).sendKeys("Learn Automation");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

	@AfterMethod
	public void teardown(ITestResult res) {
		System.out.println("Status is " + res.getStatus());
		System.out.println(ITestResult.FAILURE);
		if (ITestResult.FAILURE == res.getStatus()) {
			try {
				System.out.println("Started try phase");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:/Selenium/new1.png"));
				System.out.println("Its failed");
			} catch (Exception e) {

				System.out.println("Message is " + e.getMessage());
			}
		}
	}
}