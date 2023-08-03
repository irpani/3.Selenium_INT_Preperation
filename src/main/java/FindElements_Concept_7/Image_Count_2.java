package FindElements_Concept_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//gettext()       --- for webElements
// getattribute() --- method for attributes
//Images are having Different types Of Attributes
//Images are represeted by img tag and then there are  Specific attributes... u  can see alt
//src - where those images coming from

//You have to get the count of all images of the page
//them print the src/alt attributes of each link on  the console
public class Image_Count_2 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		driver.get("https://www.freshworks.com/");

		/*
		 * List<WebElement> img_list = driver.findElements(By.tagName("img"));
		 * System.out.println(img_list.size()); for (WebElement e : img_list) { String
		 * alt_value = e.getAttribute("alt"); String src_value = e.getAttribute("src");
		 * System.out.println(alt_value + "----->" + src_value);
		 */
		By img_list = By.tagName("img");
		List<WebElement> count = getElements(img_list);
		System.out.println(count.size()); // size()
		for (WebElement e : count) {

			// with this code I'm getting some blank spaces
			// (Q):How can we fix it ?

			String text = e.getText();
			if (!text.isEmpty()) { // isEmpty()
				System.out.println(text);
			}

		}

	}

	public static List<WebElement> getElements(By Locator) {

		return driver.findElements(By.tagName("a"));
	}

}
