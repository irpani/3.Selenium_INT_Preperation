package Assertions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Listner implements IRetryAnalyzer {

	// Minimum tries to re run the failed script
	int mincount = 0;

	// Maximum tries to rerun the failed script
	int maxcount = 2;

	// override retry method
	public boolean retry(ITestResult res) {

		// this will run until max count completes if test pass within this frame it
		// will come out of for loop
		if (mincount <= maxcount) {
			// Print the test name which failed
			System.out.println("Following test is failing " + res.getName());

			// print counter values
			System.out.println("The number of times test has been tried " + (mincount + 1));

			mincount++;
			return true;

		}
		return false;
	}

}