package Actions_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");

		/*
		 * WebElement
		 * demoframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 * driver.switchTo().frame(demoframe); //Thread.sleep(3000L);
		 */

		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

		Actions action = new Actions(driver);
		Thread.sleep(3000L);
		action.dragAndDropBy(resizable, 400, 200).perform();
		// action.dragAndDropBy(resizable, resizable.getLocation().getX()+100,
		// resizable.getLocation().getY()+200).perform();
		Thread.sleep(3000L);
		// dragMe, dragMe.getLocation().getX()+100,
		// dragMe.getLocation().getY()+100).perform()
		System.out.println("Element Resized");
		driver.quit();

	}

}