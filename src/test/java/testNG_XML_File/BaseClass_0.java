package testNG_XML_File;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

//(1).Parameterization with url,Browser
//(2).Verbose Range 1-10   Min -1 & Max -10  
//Ex:Ideal value of verbose is 3-4 that is more than enough .... otherwise It will give u so mch information
//(3).ThreadCount & Parallel  means =>How many threads u genearte 
//Ex: ThreadCount="3",parallel="tests"   means xml testblocks ....
//Ideal value of ThraedCount Based On System to System ....

//Q: Can we achieve parallel execution with Selenium with_Out testNG?
//:With out testNg wew cann't do that ... if u want to do that u should implement 
// it's own  multithread concept ...  that will be ery very complex ...
public class BaseClass_0 {
	public WebDriver driver;

	// _____Parameterization Concept____ It will take arguments from xml file
	@Parameters({ "url", "browser" })
	@BeforeTest
	public void setUp(String url, String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {

			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Browser not Matched ....");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
