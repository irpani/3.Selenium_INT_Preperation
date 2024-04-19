package JQery_DropDown_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_DropDown {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.fi/2016/08/bootstrap-dropdown-example-for-selenium.html");

		WebElement ele = driver.findElement(By.id("menu1"));
		ele.click();
		List<WebElement> li = driver.findElements(By.xpath(".//ul[@class='dropdown-menu']//li//a"));

		for (WebElement element : li) {
			String ss = element.getAttribute("innerHTML");
			System.out.println("The value is " + element.getText());
			if (ss.contains("JavaScript")) {
				System.out.println("We got what we were looking for");
				element.click();
				break;
			}
		}

	}

}
