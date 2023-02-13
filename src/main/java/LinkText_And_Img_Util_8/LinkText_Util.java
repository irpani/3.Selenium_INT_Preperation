package LinkText_And_Img_Util_8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//See here printing on conole it doesn't matter   ... what I want is 
//I want to capture this &  then we have to get the count of this fine then return 
//return what ??? list<Strings> ---> This will hold the text of each link 
//How do I will do that ? Create a => GENERIC METHOD

public class LinkText_Util {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		driver.get("https://www.freshworks.com/");
		By links = By.tagName("img");
		List<WebElement> linklist = getElements(links);

		int count = getElementsCount(links);
		System.out.println(count);
		// Now we have to capture the text of each link we will store it some where
		getElementTextList(links);
	}

	public static List<String> getElementTextList(By Locator) {
		List<WebElement> eleList = getElements(Locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String eleText = e.getText();
			if (!eleText.isEmpty()) {
				System.out.println(eleText);
			}
		}
		return eleTextList;
	}

	public static int getElementsCount(By Locator) {

		return getElements(Locator).size();
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(By.tagName("a"));
	}

}
