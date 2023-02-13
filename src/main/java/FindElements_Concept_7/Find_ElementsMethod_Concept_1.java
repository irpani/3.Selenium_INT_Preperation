package FindElements_Concept_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Diff B/w //findElement() & //findElements() ?
//____findElement()_______ method Can utilize any locator
//Locator's ----8 types
// 1.d /2.name /3.classname /4.tagname/5.link text/6.partial link text/7.css/8.xpath

//Always Crete the web Element then Perform Actions
// Q:How to create webElements ?
// A: with help of driver.findElement(by)=> method asks send parameter as by
// 
// Create webElement +actions(Click,sendkeys,getetxt(),isDisplayed,isEnabled()
// .Click()
// .sendkeys()
// .getText()
// IsSelected()
// IsEnabled()
// IsDisplayed()

//______findElements()_____ utilized only tagname =>  By.tagname() 
//with this we can find All images /links  or it Colud be any thing on the Page
//perform Actions like 
//.getattribute()
public class Find_ElementsMethod_Concept_1 {

	public static void main(String[] args) {

		// You have to get the all links & images on webPage
		// Then print the text of each link on the console

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total links:" + linksList.size()); // size()
		/*
		 * for (int i = 0; i < linksList.size(); i++) { String text =
		 * linksList.get(i).getText(); System.out.println(text); }
		 */
		// for each Loop
		for (WebElement e : linksList) {
			String text1 = e.getText();
			if (!text1.isEmpty()) { // this is return because I have seen some links text getting blank
				System.out.println(text1);

			}
		}

	}
}
