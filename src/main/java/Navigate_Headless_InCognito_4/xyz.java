package Navigate_Headless_InCognito_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class xyz {

	private static WebDriver driver;

	public static boolean getRighrwindow(String windowTitle) {
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>();
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();

			if (title.contains(windowTitle)) {
				System.out.println("Found the right window");
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		getRighrwindow("Facebook");

	}
}
