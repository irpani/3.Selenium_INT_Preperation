package testNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest_4 {

	public WebDriver driver;

	// Q:How Many times Browser got launched?
	// A: 3 Times Browser will be launched & quit the Browser ...
	// Because @BeforeMethod will make pairs based On @test methods in that class{}

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void searchTest() {

		boolean flag = driver.findElement(By.linkText("हिन्दी")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void googleSearchTest() {

		boolean flag = driver.findElement(By.linkText("తెలుగు")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void urlTest() {

		String str = driver.getCurrentUrl();
		System.out.println(str);
		Assert.assertTrue(str.contains("google"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}