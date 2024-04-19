package GoogleSearch_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Q:How Can we handle this ????

//Simple find the xapth for ul-LI COMBINAITON
//Use driver.findElements()

//_______Ajax Componants________ Asynchronous Ajax JavaScript Componants .
//Q:how Suggestios are Coming
//A:when we search keywod "Naveen Automation Labs" in Google search 
// which technology here google is  using to display the suggestions 
//A specific Concept here Can Any one tell me ?
//How Exactly It is Coming??
//Q:What kind of Element it is firstof all?
//A: It is Ajax Componants .....Asynchronous Ajax JavaScript Componants ....
//when hit the  Google Server It will check for Keyword "Naveen Automaton labs" ->
//hOW Many Suggestions will give to the Client?
//These many sugestions will come from Google Server 
//It's looks like Dropdown  but These are suggestions not Dropdowns ......
//U can find these in
//(1).E_Commerce Applications
//(2).In Google =>Search 

public class GoogleSearchTest_1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen Automationlabs"); // Moment I selected this kEYWORD Suggestion
																			// will come
		Thread.sleep(5000);
		// Under this <ul><li1> ....<li10> <ul/>Available ...
		// So we need to write One Xpath for P-C combination
		List<WebElement> suggList = driver
				.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));
		// By suggList = By.xpath("");
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			String str = e.getText();
			// System.out.println(str);
			if (str.equals("naveen automationlabs github")) {
				e.click();
				break;
			}

		}
		// Assignment Automation practice ----> search for any dress on suggestion click
		// on it

		// One More we can do in this
	}
}