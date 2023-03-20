package Get_Window_Handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getwindowhandles {

	@Test
	public void getwindowhandle() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/");
		String pwd = driver.getWindowHandle();
		System.out.println(pwd);

		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/social-icon/facebook.png']"))
				.click();
		Set<String> windows = driver.getWindowHandles();

		for (String string : windows) {

			if (!string.equals(pwd)) {
				driver.switchTo().window(string);
				String s = driver.getTitle();
				System.out.println(s);
			}

		}
	}
}
