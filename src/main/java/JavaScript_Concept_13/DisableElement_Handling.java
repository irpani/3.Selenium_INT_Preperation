package JavaScript_Concept_13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisableElement_Handling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://seleniumpractise.blogspot.fi/2016/09/how-to-work-with-disable-textbox-or.html");

		JavascriptExecutor jse = (JavascriptExecutor) dr;
		// Send key values
		// jse.executeScript("document.getElementById('pass').value = 'hdfhsjdfhja';");
		// dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("aadsfdaf");

		// click on disable buttons
		jse.executeScript("document.getElementById('pass').click();");
		// dr.findElement(By.xpath(".//*[@id='pass']")).click();

		// Check in check boxes which are disbale.
		jse.executeScript("document.getElementById('pass').checked=false;");
		Thread.sleep(3000);
		dr.quit();
	}

}