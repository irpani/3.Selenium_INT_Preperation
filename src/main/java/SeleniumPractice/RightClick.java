package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(ele).build().perform();

		List<WebElement> rightEles = driver.findElements(By.cssSelector("ul.context-menu-list span"));

		System.out.println(rightEles.size());

		for (WebElement e : rightEles) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				e.click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				break;
			}

		}

	}

}
