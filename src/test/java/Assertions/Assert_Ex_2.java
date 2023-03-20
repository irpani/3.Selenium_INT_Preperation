package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Ex_2 {

	@Test(retryAnalyzer = Failed_test_cases.class)
	public void verifySeleniumTitle() {

		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");

		WebDriver dr = new FirefoxDriver();

		dr.get("http://www.learn-automation.com");

		/*
		 * Here we are verifying that title contains QTP or not. This test will fail
		 * because title does not contain QTP
		 */

		Assert.assertEquals(dr.getTitle(), "Selenium");

	}

}