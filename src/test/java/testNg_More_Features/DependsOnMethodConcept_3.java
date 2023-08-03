package testNg_More_Features;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//******imp point **** Before move to Dependent on methods Topic
//_____Industry Standard we Follows ______
//1.Test Case Should be Independent
//2.Never Create any Dependency
//3.Every Test should have it's Own Pre_Condiotion ,testSteps,Assertion,Status ...

public class DependsOnMethodConcept_3 {
	// DependsOnMethodConcept : means One Method depends On another method ....
	// Case(1):homePageTest & SearchPageTest depends On logintest --- pass
	// Case(2):I deliberately fail the loginTest In this Case depenedent methods
	// failed means Skipped Execution
	// Case(3):Q: DependendsOnMethods Vs Priority which one will be prefer first
	// A:DependendsOnMethods will be prefered Don't give priority for super test
	// method

	/*
	 * @BeforeTest //It will executed only once public void launchBrowser() {
	 * System.out.println("Launch The Browser ...");
	 * 
	 * }
	 */
	/*
	 * @BeforeMethod // It will creates pairs .. public void launcgBrowser() {
	 * System.out.println("Launch The Browser ...");
	 * 
	 * }
	 */
	@BeforeMethod // In this all cases got skipped because @BeforeMethod itself failed.
	public void launcgBrowser() {
		System.out.println("Launch The Browser ...");
		int i = 9 / 0;
	}

	@Test
	public void createUserTest() { // Super Test Method

		System.out.println("create User Test");
		// int i = 9 / 0;
	}

	@Test()
	public void loginTest() { // Super Test Method

		System.out.println("Login to  Application");
		// int i = 9 / 0;
	}

	// After login Successfully User may navigate to any one of the pages
	// Q:Can I create any method depends on 2 methods ?
	// A:Yes
	@Test(dependsOnMethods = { "loginTest", "createUserTest" }, priority = 1)
	public void homePageTest() {

		System.out.println("home page test.....");

	}

	@Test(dependsOnMethods = "loginTest", priority = 2)
	public void SearchPageTest() {

		System.out.println("Search Page test ....");

	}

}
