package GoogleSearch_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Use driver.findElements()
//Simple find the xapth for ul-LI COMBINAITON 

public class SuggList_Handle_2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// first enter the text in search box
		driver.findElement(By.id("search-query-top")).sendKeys("Dress");// This we entered in search box
		// Better to give some time so that some times It will tales time to show the
		// sugestion list
		Thread.sleep(5000);
		// Capture the X_path for Ul-li Combination
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));

		suggList.size();
		for (WebElement e : suggList) {

			String str = e.getText();
			if (str.equals("casual dresses")) {
				e.click();
				break;
			}

		}

	}

}
