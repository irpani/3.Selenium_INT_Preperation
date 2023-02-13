package testNG_XML_File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest_2 extends BaseClass_0 {

	@Test(priority = 1)
	public void contactSalesTest() {
		// driver.get("https://www.orangehrm.com/");
		boolean flag = driver.findElement(By.linkText("Contact Sales")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void urlTest() {

		String str = driver.getCurrentUrl();
		System.out.println(str);
		Assert.assertTrue(str.contains("orangehrm"));
	}

}
