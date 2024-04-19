package testNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest_3 {

	public WebDriver driver;

	// Q:How Many times Browser got launched?
	// A: Only 1 time Browser will be launched & finally quit the Browser ...
	// Because @BeforeTest will executed only once
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}