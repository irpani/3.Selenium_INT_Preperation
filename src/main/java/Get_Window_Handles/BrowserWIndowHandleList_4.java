package Get_Window_Handles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWIndowHandleList_4 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		System.out.println(driver.getWindowHandle());

		driver.findElement(By.linkText("Good PopUp #3")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> windowsList = new ArrayList<String>(handles);

		String parentWindowID = windowsList.get(0);
		String childWindowID = windowsList.get(1);

		System.out.println(parentWindowID);
		System.out.println(childWindowID);

	}

}