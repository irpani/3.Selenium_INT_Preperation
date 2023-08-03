package testNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotatiosConcept_2 {
	// Q:Can we write main method in testNG?
	// A:Yes I'm able to write the main Method() But there is no use in testNG ....
	public static void main(String[] args) {

	}
	// Every Annotation is Associated with Method ...

	// Q1:these are the below Annotations ? How did they will strat workimg ?
	// Q2What is the Sequence ?
	// A:
	/*
	 * BS ----- DBConnection BT ------ Create User BC ------ Launcg Browser Bm
	 * ------ Login to App account Info Test Logout Bm ------ Login to App User Info
	 * Test Logout Logout Delete User PASSED: accountInfoTest PASSED: userInfoTest
	 * 
	 * @BeforeSuite
	 */
	@BeforeSuite // 1
	public void DBConnection() {
		System.out.println("BS ----- DBConnection");
	}

	@BeforeTest // 2
	public void createUser() {
		System.out.println("BT ------ Create User");
	}

	@BeforeClass // 3
	public void launchBrowser() {
		System.out.println("BC ------ Launcg Browser");
	}

	@BeforeMethod // 4
	public void loginToApp() {
		System.out.println("BM ------ Login to App");
	}

	// I'm going to write Testcases All Testcases return with @Test
	@Test
	public void userInfoTest() {

		System.out.println("UserInfo Test");
	}

	@Test
	public void accountInfoTest() {

		System.out.println("account Info Test");
	}

	@AfterMethod // 5
	public void logout() {
		System.out.println("AM ---- Logout");
	}

	@AfterClass // 6
	public void clearBrowser() {
		System.out.println("AC ---- Logout");
	}

	@AfterTest // 7
	public void deleteTestUser() {
		System.out.println("After Test --- Delete User");
	}

	@AfterSuite // 8
	public void disCoonectDataBase() {
		System.out.println("After Suite ---- Closed DB");
	}

}
