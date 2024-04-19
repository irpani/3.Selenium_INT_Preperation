package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Ex_2 {

	@Test(retryAnalyzer = Failed_test_cases.class)
	public void verifySeleniumTitle() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.learn-automation.com");
		String actTitle = driver.getTitle();
		/*
		 * Here we are verifying that title contains QTP or not. This test will fail
		 * because title does not contain QTP
		 */
		System.out.println(driver.getTitle());
		Assert.assertEquals(actTitle, "Automation - Selenium WebDriver tutorial Step by Step");

	}

}