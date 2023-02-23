package Alert_Popups_9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//FYI :Synchronization time we will write  the utilities for alerts
public class Js_Alert_Popup_5 {

	// What is Alert () ----> It's not webElmenet & It's not part of the page
	// These alerts never be in html dom
	// These are coming becasue Of Browser so question how we will validate this ?
	// In this case what should we do ?
	// JavaScript Pop_up means --> which is coming for JavaScript return by the
	// Devoloper
	// Ex:(1). Are u sure to confirm the payment
	// (2).Are u Sure to purchase the item

	// It Could be:
	// (1).Alert Popup()
	// (2).Confirmation Pop_up()
	// (3).Warning mnessage/Error Pop_up()
	// (4).Submission Popup()
	// (5).Modal Dialogue
	// (6).Js Popup

	// Only one alert at a time we cann't handle multiple At a Time ...
	// It can be 1 after another click on k then another like wise we can handle at
	// a time not possible
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mail.reddif.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert(); // alert () method return Alert
		// getText()
		String text = alert.getText();
		System.out.println(text);

		if (text.equals("please enter a valid username")) {
			System.out.println("Correctg Validation message");
		}
		// Either we can accept () or dismiss() the alert
		alert.accept();
		alert.dismiss();
		alert.getText();

	}

}
