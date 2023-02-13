package FindElements_Concept_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElement_Concept_3 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

		// Diff B/w findElement() & findElements() Concept:-
		// -------------------- -------------------

		// findElement():-
		// ----------------
		// WebElement firstName=driver.findElement(By.id("Form_getForm_FullName"));
		// Suppose If locator got chnaged getting As
		// org.openqa.selenium.NoSuchElementException:
		WebElement firstName = driver.findElement(By.id("Form_getForm_FullName11"));

		// findElements():-
		// ----------------
		// List<WebElement> list = driver.findElements(By.className("text"));
		// List<WebElement> list = driver.findElements(By.className("text11"));
		// System.out.println(list.size());

		// Suppse trw text also changed to text11 then it will throw Exception ?
		// A: No

		// Q2 findElement() VS findElements() Which is powerfull?
		// A: findElements() bcz findElement() internally uses findElements() only

	}

}
