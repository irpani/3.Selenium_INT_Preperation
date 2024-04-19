package LinkText_And_Img_Util_8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images_Util {
	public static WebDriver driver;
	// You have to get the count of All images of page
	// Then capture the src/alt attribues of each image on the console

	// We want to create one Generic method so that we can capture any attribute
	// Not Specific to srcv/alt
	public static void main(String[] args) { // User Logic

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
		driver.get("https://www.freshworks.com/");
		By img_list = By.tagName("img"); // Now u can call with any attribute by passing here
		By link_list = By.tagName("a");
		// List<WebElement> images = getElements(img_list);

		System.out.println(getElmenets_Count(img_list));

		List<String> attrList = getAttributesList(img_list, "src"); // This gives a List Of Strings
		printElementValues(attrList); // Created a Generic method for this also ...
		printElementValues(getAttributesList(img_list, "alt"));
		printElementValues(getAttributesList(link_list, "href"));
	}

	// (1).List Of webElements
	public static List<WebElement> getElements(By Locator) {

		return driver.findElements(Locator);
	}

	// (2).Size Of Above List
	public static int getElmenets_Count(By Locator) {

		return getElements(Locator).size();
	}

	// (3).This is the Gm Logic for html tag Corresponding Attribute
	public static List<String> getAttributesList(By Locator, String attributeName) {

		List<WebElement> eleList = driver.findElements(Locator);
		// I will take one Arraylist
		List<String> attrList = new ArrayList<String>();
		for (WebElement e : eleList) { // Then do what each & every elemet
			// ****This is called TestDriven Approch
			String attrvalue = e.getAttribute(attributeName);// here 1 more parameter required which attribute u lookfor
			attrList.add(attrvalue);
		}
		return attrList;
	}

	// (4). from Above method I get list of specific Attributes in the form of
	// Strings
	// I will print all the values
	public static void printElementValues(List<String> eleList) {
		for (String e : eleList) {
			System.out.println(e);
		}

	}

}
