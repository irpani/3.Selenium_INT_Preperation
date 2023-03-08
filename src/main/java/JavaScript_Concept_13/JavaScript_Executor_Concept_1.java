package JavaScript_Concept_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Selenium Didn't give u everything
//Some properties we will achiece through JavaScript
//for this we are  using JavaSciptExecutor(I).....

public class JavaScript_Executor_Concept_1 {

	public static void main(String[] args) throws InterruptedException {

		// JavaScript concept we will see today ....
		// These are the important ones ...u have to use
		// Generate alert
		// Capture the text of the entire page
		// Scroll_up, Scroll_down
		// u can perform .click() also with the help of JavaScript Executor
		// And we will see what are the advantages...And what are the imp concepts

		// --- >so for that purpose what I have done is I have already created one Js
		// Utility
		// just like we created Browser_Uti/Element util.java =>Similarly I have created
		// Js Utility

		// In Js Utility One imp thing u will see

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stage-medicare.uhc.com/retiree");
		// when ever u want to execute JavaScript Code u should use =>
		// JavascriptExecutor
		/*
		 * JavascriptExecutor js = ((JavascriptExecutor) driver);
		 * js.executeAsyncScript("alert('Hi')");
		 */
		// Now I start utilizing Js Utility methods which already created by Naveen

		// (1).getTitle() Of the Page Using Java Script
		JavaScript_Util_0 jsUtil = new JavaScript_Util_0(driver);
		String str = jsUtil.getTitleByJS();
		System.out.println(str);

		// (2).Alert() popup launched --- Using Js

		// jsUtil.generateAlert("This is my JavaScript Popup");

		// (3).**Gives the complete text of the entire page ... we have seen ind EleMENT
		// getetxt() method
		// which we can handle it in Js it will give all page text in 1 shot
		/*
		 * String innerText = jsUtil.getPageInnerText(); System.out.println(innerText);
		 * System.out.println(innerText.contains("Group Calendar"));
		 */
		// (4).Refresh the page using Javascript

		// jsUtil.refreshBrowserByJS();

		// (5).Draw Border Method: HighLight Particular webElement then take ScreenShot
		// useful method
		// WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));

		// jsUtil.drawBorder(login);

		// (6).Element got flashed ---- you will find out driver control on Page

		// jsUtil.flash(login);

		// (7).Click Element By Javascript
		// WebElement register = driver.findElement(By.linkText("Register"));
		WebElement about_us = driver.findElement(By.linkText("About Us"));
		// jsUtil.clickElementByJS(register);
		// Q:hOW Many types Of click() methods are Available ?
		// Selenium WE -----perfom ---Click
		// Actions=> moveElement --- click()
		// Js --- click()
		// Exp wait --- -WE -> click()

		// (8).**Scroll 4 Methods N't avaialble in selenium ...
		// jsUtil.scrollPageUp();
		// jsUtil.scrollPageDown();
		// jsUtil.scrollPageDown(height);
		// jsUtil.scrollIntoView(about_us);
		// Vertical Scroll:
		// Horizontal Scroll

		// Create object of JavascriptExecutor
		// Vertical Scroll:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,350)");
		// Horizontal Scroll
		js.executeScript("javascript:window.scrollBy(250,0)");

		jsUtil.scrollPageDown(); // Complete Scroll down
		// jsUtil.scrollPageDown("150"); //Scroll up to Speicific Height
		Thread.sleep(5000);
		jsUtil.scrollPageUp(); // Scroll Page up ...
		Thread.sleep(5000);
		jsUtil.scrollIntoView(about_us);

		// (9).sendkeys() method

		// jsUtil.sendKeysUsingWithId(id, value);

		// (10).How to get the value from the text field?
		// A: Using getattribute() method not from gettext()

	}

}
