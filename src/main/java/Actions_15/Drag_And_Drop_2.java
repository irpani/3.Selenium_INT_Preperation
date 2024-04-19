package Actions_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Q:How to deal with Actions ?
//A:____Simple Logic  create webElement then perform Actions _______
public class Drag_And_Drop_2 {

	// Drag& Drop:
	// Drag& Drop we can perform with respect to webElement to => webElement only On
	// ele to ele on web page
	// _____Drag& Drop Actions____
	// 1.Click& hold
	// 2.Move to Particula Element
	// 3.Then drop
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement soureEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		// Then we have to perform UserActions
		Actions act = new Actions(driver);

		act.clickAndHold(soureEle).moveToElement(targetEle).release().build().perform();

		// Direct Method also Available
		// act.dragAndDrop(soureEle, targetEle).build().perform();
		driver.quit();
	}
}