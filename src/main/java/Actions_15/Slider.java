package Actions_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://jqueryui.com/slider/");

		WebElement demoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demoframe);
		// Thread.sleep(3000L);

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

		Actions action = new Actions(driver);
		Thread.sleep(3000L);
		action.dragAndDropBy(slider, 90, 0).perform();
		Thread.sleep(3000L);
		driver.quit();
	}

}
