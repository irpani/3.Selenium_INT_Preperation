package Frames_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Frames_Concept:
//Q:What is frame ?
//A:frame is a webElement having html tag <frame>  </frame>

//Frames are Not  Available on webPage .... 
//Frames are having their own DOM --> Document Object Model 

/*<frame><header>..</header><body>...</body>

</frame>*/

//_____frame having Methods_____
//driver.switchTo().frame(index);
//driver.switchTo().frame(id(or)name);
//driver.switchTo().frame(webElement);
public class Frames_Handle_1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");

		driver.switchTo().frame(2); // Not prefered much ... trw there may be chance
		// of
		// index change
		// driver.switchTo().frame("main");
		String header = driver.findElement(By.xpath("html/body/h2")).getText();
		System.out.println(header);

	}

}
