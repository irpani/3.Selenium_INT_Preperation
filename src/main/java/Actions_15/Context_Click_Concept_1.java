package Actions_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Q:How to deal with Actions ?
//A:____Simple Logic  create webElement then perform Actions _______
//These Are Called User Actions ......
//(1).Right Click
//(2).Double Click 
//(3).Drag & Drop 

//To Handle user Actions in selenium we have 1 class in Selenium called=>Actions Class{}
public class Context_Click_Concept_1 {
	// ____Right Click Concept _______

	// Right Click On Specific webElemnent also ....
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions actions = new Actions(driver);

		// here only 1 Action so I can write like this
		actions.contextClick(rightClickMe).build(); // Not Valid
		actions.contextClick(rightClickMe).perform(); // valid
		actions.contextClick(rightClickMe).build().perform(); // valid

		List<WebElement> text = driver.findElements(By.xpath(
				"//ul[@class='context-menu-list context-menu-root']/li[contains(@class,' context-menu-icon')]/span"));
		System.out.println(text.size());
		for (WebElement e : text) {
			String str = e.getText();
			System.out.println(str);
			if (str.equals("Cut")) {
				e.click();
			}
		}

	}

}
