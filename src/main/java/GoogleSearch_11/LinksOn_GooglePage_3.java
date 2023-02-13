package GoogleSearch_11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//fun --->  Click On the Specific link
//fun --->  Return list of the  link text
public class LinksOn_GooglePage_3 {
	// Already we discussed All images/links on Page ...
	// I want links on Specific Area
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		By langlinks = By.xpath("//div[@id='SIvCob']/a");
		// clickOnElement(langlinks, "हिन्दी ");
		List<String> actualLinksTextList = getLinksTextList(langlinks);
		if (actualLinksTextList.contains("తెలుగు")) {
			System.out.println("తెలుగు present in the list");
		}
	}

	public static List<String> getLinksTextList(By Locator) {

		List<WebElement> elemList = driver.findElements(Locator);
		List<String> linksTextList = new ArrayList<String>();
		System.out.println(elemList.size());
		for (WebElement e : elemList) {
			String text = e.getText();
			linksTextList.add(text);

		}
		return linksTextList;
	}

	public static void clickOnElement(By Locator, String linktext) {

		List<WebElement> langList = driver.findElements(Locator);
		System.out.println(langList.size());
		for (WebElement e : langList) {
			String text = e.getText().trim();
			if (text.equals(linktext)) {
				e.click();
				break;
			}
		}

	}

}
