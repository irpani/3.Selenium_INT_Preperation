package testNG_XML_File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest_3 extends BaseClass_0 {

	@Test(priority = 1)
	public void registerTest() {
		// driver.get("https://demo.opencart.com/index.php?route=account/login");
		boolean flag = driver.findElement(By.linkText("Privacy Policy")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void urlTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("opencart"));
	}
}
