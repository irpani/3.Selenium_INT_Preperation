package Actions_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SponsorList {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> list = driver.findElements(By.xpath("//a//span[text()='Sponsored']"));

		for (WebElement e : list) {

			String str = e.getText();
			String str1 = e.getAttribute("href");
			if (!str.equals(null)) {
				System.out.println(str);
			}
			System.out.println(str);
			System.out.println(str1);

		}

	}

}
